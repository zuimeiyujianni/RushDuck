package com.rushduck.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.rushduck.bean.Message;
import com.rushduck.bean.User;
import com.rushduck.service.BaseService;
import com.rushduck.service.CollectionService;
import com.rushduck.service.MessageService;
import com.rushduck.service.RelationService;
import com.rushduck.service.UserService;
import com.rushduck.service.VisitService;
import com.rushduck.utils.PasswordEncryptor;

@RequestMapping(value = "Controller")
@SessionAttributes(value = {"user","befollowids"})
@Controller //通过注解进行触发，将该类加入Ioc容器
public class ViewController {
	//控制器依赖Service层
	@Autowired 
	private UserService userService;
	@Autowired
	private BaseService baseService;
	@Autowired
	private RelationService relationService;
	@Autowired
	private MessageService messageService;
	@Autowired
	private CollectionService collectionService;
	@Autowired
	private VisitService visitService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void setCollectionService(CollectionService collectionService) {
		this.collectionService = collectionService;
	}
	
	public void setVisitService(VisitService visitService) {
		this.visitService = visitService;
	}
	
	@RequestMapping(value = "login_do/{pageNumber}")
	public String login_do(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> map, @PathVariable("pageNumber") Integer pageNumber){
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		System.out.println("pagenuber:" + pageNumber);
		if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
			User user = userService.login(username, password);
			if(user != null ) {
				map.put("user", user);
				if(user.getAdmin()) {
					return "redirect:/admin/backstate.jsp";
				}else {
					baseService.getPageMessageByUserId(user.getUserid(), pageNumber, map);
					return "home";
				}
			}
		}
		map.put("msg", "输入信息错误，请重新登陆");
		return "forward:/login.jsp";
	}
	
	@RequestMapping(value = "quit")
	public String exit(HttpServletRequest request, SessionStatus sessionStatus){
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.invalidate();
		sessionStatus.setComplete();
		return "redirect:/login.jsp";
	}
	
	@RequestMapping(value = "getHotPot")
	public String getHotPot() {
		return "hotpot";
	}
	
	
	@RequestMapping(value = "getPage/{userId}/{pageNumber}")
	public String getPage(@PathVariable("userId") Integer userId, @PathVariable("pageNumber") Integer pageNumber, Map<String, Object> map, HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(session);
		System.out.println("session.user = " + session.getAttribute("user"));
		if(session.getAttribute("user") == null) {
			return "redirect:/404page.jsp";
		}
		baseService.getPageMessageByUserId(userId, pageNumber, map);
		User u = (User)session.getAttribute("user");
		visitService.addVisitRecord(u.getUserid(), userId);
		return "home";
	}
	
	@RequestMapping(value = "register_do")
	public String register_do(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("phonenumber") String phonenumber,
			@RequestParam("sex") String sex, @RequestParam("school") String school, @RequestParam("emotion") String emotion, @RequestParam("bloodtype") String bloodtype,
			@RequestParam("signature") String signature, @RequestParam("wechat") String wechat, @RequestParam("qq") String qq, @RequestParam("email") String email, @RequestParam("name") String name,
			@RequestParam("birthday") String dateStr, Map<String, Object> map) {
		String salt = UUID.randomUUID().toString();
		password = new PasswordEncryptor(salt, "sha-256").encode(password);
		
		Date birthday = null;
		try {
			birthday = StringUtils.isEmpty(dateStr) ? null :  new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Boolean authenticated = false;
		Short level = 1;
		Short vip = 0;
		Integer portraitid = 1;
		Integer musicid = 1;
		
		User user = new User(null, username, password, salt, phonenumber, false, sex, school, emotion, bloodtype, signature, wechat, qq, email, name, birthday, authenticated, level, vip, portraitid, musicid);
		if(!userService.isExist(username)) {
			boolean isSuccess = userService.register(user);
			if(isSuccess) {
				System.out.println("注册成功:" + user);
				return "redirect:/login.jsp";
			}
		}
		map.put("msg", "注册失败,请重新填写");
		return "forward:/register.jsp";
	}
	
	@RequestMapping(value = "setting")
	public String getSetting() {
		//TODO
		return "setting";
	}
	
	@RequestMapping(value = "addMessage")
	@ResponseBody 
	public String addMessageAjax(@RequestParam("userid") Integer userid, @RequestParam("messageinfo") String messageinfo) {
		Message message = new Message();
		Calendar cal = Calendar.getInstance(); 
		Date date = cal.getTime();
		message.setMessagetime(date);
		message.setMessageinfo(messageinfo);
		message.setMessagepublisher(userid);
		message.setMessagetype("normal");
		message.setMessagereadingtimes(0);
		boolean isSuccess = messageService.addMessage(message);
		return "{\"isAddMessageSuccess\":" + isSuccess + "}";
	} 
	
	@RequestMapping(value = "addFollow")
	@ResponseBody
	public String addFollowAjax(@RequestParam("befolloweduserid") Integer befollowuserid, @RequestParam("followeruserid") Integer followeruserid) {
		boolean isAddFollowSuccess = relationService.addFollowRelation(followeruserid, befollowuserid);
		//System.out.println(isAddFollowSuccess);
		return "{\"isAddFollowSuccess\":" + isAddFollowSuccess + "}";
	}
	
	@RequestMapping(value = "removeFollow")
	@ResponseBody
	public String removeFollowAjax(@RequestParam("befolloweduserid") Integer befollowuserid, @RequestParam("followeruserid") Integer followeruserid) {
		boolean isRemoveFollowSuccess = relationService.removeFollowRelation(followeruserid, befollowuserid);
		//System.out.println(isAddFollowSuccess);
		return "{\"isRemoveFollowSuccess\":" + isRemoveFollowSuccess + "}";
	}
	
	@RequestMapping(value = "verifyUsername")
	@ResponseBody //只返回数据，不跳转页面
	public String verifyUsername(@RequestParam("username") String username) {
		//System.out.println("username : " + username);
		if(username.length() > 0 && username.length() <= 20) {
			for(int i = 0; i < username.length(); i++) {
				char c = username.charAt(i);
				if(c >= 0x4E00 && c <= 0x9FA5) continue;
				if(c >= '0' && c <='9') continue;
				if(c >= 'a' && c <= 'z') continue;
				if(c >= 'A' && c <= 'Z') continue;
				return "{\"isUsernameSuccess\":false}";
			}
			if(!userService.isExist(username)) {
				return "{\"isUsernameSuccess\":true}";
			}
		}
		return "{\"isUsernameSuccess\":false}";
	}
	
	@RequestMapping(value = "verifyPassword")
	@ResponseBody
	public String verifyPassword(@RequestParam("password") String password) {
		boolean isPasswordSuccess = true;
		if(password.length() >= 6 && password.length() <= 100) {
			for(int i = 0; i < password.length(); i++) {
				char c = password.charAt(i);
				if(!Character.isLetterOrDigit(c)) {
					isPasswordSuccess = false;
					break;
				}
			}
		}else {
			isPasswordSuccess = false;
		}
		return "{\"isPasswordSuccess\":" + isPasswordSuccess + "}";
	}
	
	@RequestMapping(value = "verifyPhonenumber")
	@ResponseBody
	public String verifyPhonenumber(@RequestParam("phonenumber") String phonenumber) {
		 String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
	     Pattern p = Pattern.compile(regExp);
	     Matcher m = p.matcher(phonenumber);
	     return "{\"isPhonenumberSuccess\":" + m.matches() + "}";
	}
	
	@RequestMapping(value = "verifySex")
	@ResponseBody
	public String verifySex(@RequestParam("sex") String sex) {
		boolean isSexSuccess = false;
		if(sex.equals("男") || sex.equals("女"))
			isSexSuccess = true;
		return "{\"isSexSuccess\": " + isSexSuccess +"}";
	}
	
	@RequestMapping(value = "verifySchool")
	@ResponseBody
	public String verifySchool(@RequestParam("school") String school) {
		//TODO
		return "{\"isSchoolSuccess\": true}";
	}
	
	@RequestMapping(value = "verifyEmotion")
	@ResponseBody
	public String verifyEmotion(@RequestParam("emotion") String emotion) {
		boolean isEmotionSuccess = false;
		String[] strings = new String[] {"单身","求交往","暗恋中","暧昧中","恋爱中","订婚","已婚","分居"};
		
		if(emotion.length() == 0)
			isEmotionSuccess = true;
		for(int i = 0; i < strings.length; i++) {
			if(strings[i].equals(emotion)) {
				isEmotionSuccess = true;
				break;
			}
		}
		return "{\"isEmotionSuccess\":" + isEmotionSuccess + "}";
	}
	
	@RequestMapping(value = "verifyBloodtype")
	@ResponseBody
	public String verifyBloodtype(@RequestParam("bloodtype") String bloodtype) {
		boolean isBloodtypeSuccess = false;
		if(bloodtype.length() == 0 || bloodtype.equals("A") || bloodtype.equals("AB") || bloodtype.equals("B") ||bloodtype.equals("O"))
			isBloodtypeSuccess = true;
		return "{\"isBloodtypeSuccess\":" + isBloodtypeSuccess + "}";
	}
	
	@RequestMapping(value = "verifySignature")
	@ResponseBody
	public String verifySignature(@RequestParam("signature") String signature) {
		boolean isSignatureSuccess = signature.length() <= 100;
		//TODO 敏感词过滤
		return "{\"isSignatureSuccess\": " + isSignatureSuccess + "}";
	}
	
	@RequestMapping(value = "verifyWechat")
	@ResponseBody
	public String verifyWechat(@RequestParam("wechat") String wechat) {
		boolean isWechatSuccess = true;
		if(!StringUtils.isEmpty(wechat)) {
			for(char ch : wechat.toCharArray()) {
				if(!Character.isLetterOrDigit(ch) && ch != '_') {
					isWechatSuccess = false;
					break;
				}
			}
		}
		//System.out.println("test: " + isWechatSuccess);
		return "{\"isWechatSuccess\": " + isWechatSuccess + "}";
	}
	
	@RequestMapping(value = "verifyQq")
	@ResponseBody
	public String verifyQq(@RequestParam("qq") String qq) {
		//qq的长度5-11
		boolean isQqSuccess = qq.matches("[1-9][0-9]{4,10}");
		if(qq.length() == 0)
			isQqSuccess = true;
		return "{\"isQqSuccess\":" + isQqSuccess + "}";
	}
	
	@RequestMapping(value = "verifyEmail")
	@ResponseBody
	public String verifyEmail(@RequestParam("email") String email) {
		boolean isEmailSuccess = false;
		if(email.length() == 0)
			isEmailSuccess = true;
		String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"; 
        Pattern p = Pattern.compile(regEx1);
        Matcher m = p.matcher(email);
        if(m.matches())
        	isEmailSuccess = true;
        //判断长度
        if(email.length() > 320)
        	isEmailSuccess = false;
     
        return "{\"isEmailSuccess\": " + isEmailSuccess + "}";
	}
	
	@RequestMapping(value = "verifyName")
	@ResponseBody
	public String verifyName(@RequestParam("name") String name) {
		boolean isNameSuccess = true;
		if(name.length() > 33)
			isNameSuccess = false;
		for(int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if(c >= 0x4E00 && c <= 0x9FA5) {
				continue;
			}else if(Character.isLetter(c)) {
				continue;
			}else {
				isNameSuccess = false;
				break;
			}
		}
		return "{\"isNameSuccess\": " + isNameSuccess + "}";		
	}
	
	@RequestMapping(value = "verifyBirthday")
	@ResponseBody
	public String verifyBirthday(@RequestParam("birthday") String birthday) {
		boolean isBirthdaySuccess = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //setLenient(false)是必须的，对日期格式进行严格的限制
        //输入"2018-02-31"时返回true，日期默认转换为了2018-03-03，未对时间格式进行严格的限制"
        try {
            format.setLenient(false);
            format.parse(birthday);
        }catch (Exception e){
            isBirthdaySuccess = false;
        }
        return "{\"isBirthdaySuccess\": " + isBirthdaySuccess + "}";	
	}
	
	public void getDynamic(Map<String, Object> map) {
		/*模拟
		Portrait p = new Portrait();
		p.setPortraitid(1);
		p.setPortraiturl("portrait/portrait-1.jpg");
		Music music = new Music();
		music.setMusicid(1);
		music.setMusicurl("http://np01.sycdn.kuwo.cn/98ded76ff7b8e76b0d9e637402c9594b/5ea04a81/resource/n3/61/74/2812225485.mp3");
		map.put("music", music);
		map.put("portrait", p);
		//放四个数量值num1,num2,num3,num4
		map.put("num1", 100);
		map.put("num2", 200);
		map.put("num3", 300);
		map.put("num4", 400);
		List<User> friends = new ArrayList<User>();
		for(int i = 47; i <= 59; i++) {
			User u = userService.getUserById(i);
			if(u != null)
				friends.add(u);
		}
		map.put("friends", friends);
		
		List<Integer> userIds = visitService.allWhoVisit(1);
		List<UserBaseMessage> visiters = baseService.getUserBaseMessageByUserIdsList(userIds);
		map.put("visiters", visiters);
		List<Message> messages = messageService.getMessagesByUserId(user.getUserid());
		List<ProcessedMessage> pms = new ArrayList<>();
		System.out.println(pms);
		for(Message message : messages) {
			if(message != null) {
				ProcessedMessage pm = baseService.getProcessedMessageByMessageId(message.getMessageid());
				if(pm != null) {
					pms.add(pm);
					pm.getMessage().setMessageinfo(pm.getMessage().getMessageinfo().replaceAll("\n", "<br/>"));
					System.out.println(pm.getMessage().getMessageinfo());
					System.out.println(pm.getMessage().getMessagetime());
				}
			}
		}
		map.put("pms", pms);
		*/
	}
	
	@RequestMapping(value = "addCollection")
	@ResponseBody
	public String addCollection(@RequestParam("messageid") Integer messageid, @RequestParam("userid") Integer userid) {
		System.out.println(messageid + " : " + userid);
		boolean isAddCollectionSuccess = collectionService.addCollection(messageid, userid);
		return "{\"isAddCollectionSuccess\": " + isAddCollectionSuccess + "}";		
	}
	
	@RequestMapping(value = "removeCollection")
	@ResponseBody
	public String removeCollection(@RequestParam("messageid") Integer messageid, @RequestParam("userid") Integer userid) {
		boolean isRemoveCollectionSuccess = collectionService.removeCollection(messageid, userid);
		return "{\"isRemoveCollectionSuccess\": " + isRemoveCollectionSuccess + "}";		
	}
	
	@RequestMapping(value = "pwd")
	public String pwd() {
		return "pwd";
	}
	
	@RequestMapping(value = "changePwd")
	public String changePwd(@RequestParam("oldPwd") String oldPwd, @RequestParam("newPwd1") String newPwd1, @RequestParam("newPwd2") String newPwd2, @RequestParam("userid") Integer userid, Map<String, Object> map) {
		if(newPwd1 == null || newPwd2 == null || newPwd1.length() == 0 || newPwd2.length() == 0 || newPwd1.equals(newPwd2) == false || oldPwd == null || oldPwd.length() == 0) {
			map.put("msg", "密码为空或者新密码两次的输入不一致");
			return "pwd";
		}
		
		User user = userService.getUserById(userid);
		
		if(user == null) {
			map.put("msg", "不存在用户ID=" + userid + "的用户");
			return "pwd";
		}
		
		String salt = user.getSalt();
		String password = user.getPassword();
		
		oldPwd = new PasswordEncryptor(salt, "sha-256").encode(oldPwd);
		if(password.equals(oldPwd) == false) {
			map.put("msg", "旧密码输入不正确");
			return "pwd";
		}
		
		String newPwd = new PasswordEncryptor(salt, "sha-256").encode(newPwd1);
		user.setPassword(newPwd);
		if(userService.updateUser(user)) {
			map.put("msg", "密码修改成功，请重新登录");
			return "login";
		}else {
			map.put("msg", "更新操作失败");
			return "pwd";
		}
	}
	
	@RequestMapping(value = "updateUserMessage")
	public String updateUserMessage(@RequestParam("userid") Integer userid, @RequestParam("username") String username, @RequestParam("phonenumber") String phonenumber,
			@RequestParam("sex") String sex, @RequestParam("school") String school, @RequestParam("emotion") String emotion, @RequestParam("bloodtype") String bloodtype,
			@RequestParam("signature") String signature, @RequestParam("wechat") String wechat, @RequestParam("qq") String qq, @RequestParam("email") String email, @RequestParam("name") String name,
			@RequestParam("birthday") String dateStr, Map<String, Object> map) {
		User user = userService.getUserById(userid);
		user.setUsername(username);
		user.setPhonenumber(phonenumber);
		user.setSex(sex);
		user.setSchool(school);
		user.setEmotion(emotion);
		user.setBloodtype(bloodtype);
		user.setSignature(signature);
		user.setWechat(wechat);
		user.setQq(qq);
		user.setEmail(email);
		user.setName(name);
		Date birthday = null;
		try {
			birthday = StringUtils.isEmpty(dateStr) ? null :  new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setBirthday(birthday);
		
		boolean isSuccess = userService.updateUser(user);
		if(isSuccess) {
			map.put("msg", "用户基本信息修改成功，请重新登录");
			return "login";
		}
		map.put("msg", "密码修改成功，请重新输入");
		return "setting";
	}
}
