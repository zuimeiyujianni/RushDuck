package com.rushduck.test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rushduck.bean.Likes;
import com.rushduck.bean.Message;
import com.rushduck.bean.Music;
import com.rushduck.bean.Picture;
import com.rushduck.bean.Portrait;
import com.rushduck.bean.User;
import com.rushduck.service.BaseService;
import com.rushduck.service.LikesService;
import com.rushduck.service.MessageService;
import com.rushduck.service.MusicService;
import com.rushduck.service.PictureService;
import com.rushduck.service.PortraitService;
import com.rushduck.service.UserService;
import com.rushduck.service.VisitService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestClass {
	@Autowired
	UserService userService;
	@Autowired
	VisitService visitService;
	@Autowired
	MusicService musicService;
	@Autowired
	MessageService messageService;
	@Autowired
	PictureService pictureService;
	@Autowired
	LikesService likesService;
	@Autowired
	PortraitService portraitService;
	@Autowired
	BaseService baseService;
	//@Test
	public void test() {
		Date d = new Date();
		for(int i = 0; i <=10; i++) {
			User user = new User();
			user.setUsername("小柯" + i);
			user.setPassword("4511#b524f634gb3c2cd46146d2c!ac04F5F6#416@b1*124@*@aa#15df6d146b");
			user.setSalt("547c5bc9-d807-4a16-a568-a4b56283f6f9");
			user.setPhonenumber("17605182581");
			user.setSex( i % 2 == 0 ? "男" : "女");
			user.setSchool("南京审计大学");
			user.setEmotion("");
			user.setBloodtype("B");
			user.setSignature("感谢你如此耀眼，做我平淡岁月里的星辰。");
			user.setWechat("ark1445133729");
			user.setQq("1445133726");
			user.setEmail("1445133726@qq.com");
			user.setName("匿名");
			Date date = new Date();
			user.setBirthday(date);
			Boolean authenticated = new Random(47).nextBoolean();
			Short level = 3;
			Short vip = 1;
			Integer portraitid = i;
			Integer musicid = i % 2 + 1;
			user.setAuthenticated(authenticated);
			user.setAdmin(false);
			user.setLevel(level);
			user.setVip(vip);
			user.setMusicid(musicid);
			user.setPortraitid(portraitid);
			userService.register(user);
			System.out.println(user);
		}
	}
	
	//@Test
	public void test1() {
		for(int i = 47; i <= 70; i++) {
			visitService.addVisitRecord(i, 1);
			System.out.println("插入访问记录成功");
		}
	}
	
	//@Test
	public void test2() {
		Music music = musicService.getMusicByMusicId(1);
		System.out.println(music);
	}
	
	
	//@Test  //插入message
	public void test3() {
		List<User> users = userService.getAllUsers();
		Random rand = new Random();
		for(int i = 0; i <=100; i++) {
			Message message = new Message();
			Integer n = rand.nextInt(users.size());
			message.setMessagepublisher(users.get(n).getUserid());
			message.setMessageinfo("天地之间，龙凤齐鸣，犹如天地主宰." + i);
			message.setMessagereadingtimes(new Random().nextInt(500));
			message.setMessagepictureid1(new Random().nextInt(7) + 7);
			message.setMessagepictureid2(new Random().nextInt(7) + 7);
			message.setMessagepictureid3(new Random().nextInt(7) + 7);
			Calendar cal = Calendar.getInstance(); 
			Date date = cal.getTime();
			message.setMessagetime(date);
			message.setMessagetype("normal");
			messageService.addMessage(message);
			System.out.println(message);
		}
		
	}
	
	//@Test //插入图片
	public void test4() {
		for(int i = 0; i < 6; i++) {
			Picture picture = new Picture();
			picture.setPicturetype("LOCAL");
			picture.setPictureurl("messagepicture/" + (i+1) + ".jpg");
			boolean ok = pictureService.insertPicture(picture);
			System.out.println("statu : " + ok + "  " + picture);
		}
	}
	
	//@Test
	public void test5() {
		List<Message> messages = messageService.getMessagesByUserId(1);
		for(int i = 0; i <= 86 - 47; i++){
			Likes likes = new Likes();
			likes.setLikemessageid( messages.get(new Random().nextInt(messages.size())).getMessageid());
			likes.setLikeuserid( i + 47);
			likesService.addLikesMessage(likes);
			System.out.println(likes);
		}
	}
	
	//@Test
	public void test6() {
		for(int i = 3; i <= 55; i++) {
			Portrait p = new Portrait();
			p.setPortraittype("LOCAL");
			p.setPortraiturl("portrait/" + i + ".jpg");
			portraitService.addPortrait(p);
			System.out.println(p);
		}
	}
}
