package com.rushduck.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rushduck.bean.Collection;
import com.rushduck.bean.Comment;
import com.rushduck.bean.CommentBaseMessage;
import com.rushduck.bean.Likes;
import com.rushduck.bean.Message;
import com.rushduck.bean.Music;
import com.rushduck.bean.Picture;
import com.rushduck.bean.Portrait;
import com.rushduck.bean.ProcessedMessage;
import com.rushduck.bean.Relation;
import com.rushduck.bean.User;
import com.rushduck.bean.UserBaseMessage;
import com.sun.istack.internal.NotNull;

public class BaseServiceImpl implements BaseService{
	private PortraitService portraitService;
	private MusicService musicService;
	private UserService userService;
	private MessageService messageService;
	private PictureService pictureService;
	private CommentService commentService;
	private LikesService likesService;
	private ForwardService forwardService;
	private CollectionService collectionService;
	private RelationService relationService;
	private VisitService visitService;
	
	public void setPortraitService(PortraitService portraitService) {
		this.portraitService = portraitService;
	}

	public void setMusicService(MusicService musicService) {
		this.musicService = musicService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	public void setLikesService(LikesService likesService) {
		this.likesService = likesService;
	}

	public void setForwardService(ForwardService forwardService) {
		this.forwardService = forwardService;
	}
	
	public void setCollectionService(CollectionService collectionService) {
		this.collectionService = collectionService;
	}

	public void setRelationService(RelationService relationService) {
		this.relationService = relationService;
	}

	public void setVisitService(VisitService visitService) {
		this.visitService = visitService;
	}

	@Override
	public UserBaseMessage getUserBaseMessage(@NotNull User user) {
		UserBaseMessage ubm = new UserBaseMessage(user);
		Portrait portrait = portraitService.getPortraitById(user.getPortraitid());
		Music music = musicService.getMusicByMusicId(user.getMusicid());
		if(portrait != null)
			ubm.setPortraiturl(portrait.getPortraiturl());
		if(music != null)
			ubm.setMusicurl(music.getMusicurl());
		return ubm;
	}

	@Override
	public List<UserBaseMessage> getUserBaseMessageByUserList(@NotNull List<User> users) {
		List<UserBaseMessage> ubms = new ArrayList<UserBaseMessage>();
		for(User user : users) {
			UserBaseMessage ubm = getUserBaseMessage(user);
			ubms.add(ubm);
		}
		return ubms;
	}

	@Override
	public List<UserBaseMessage> getUserBaseMessageByUserIdsList(@NotNull List<Integer> userIds) {
		List<User> users = new ArrayList<User>();
		for(Integer userId : userIds) {
			User user = userService.getUserById(userId);
			if(user != null)
				users.add(user);
		}
		List<UserBaseMessage> ubms = getUserBaseMessageByUserList(users);
		return ubms;
	}

	@Override
	public ProcessedMessage getProcessedMessageByMessageId(@NotNull Integer messageId) {
		ProcessedMessage pm = new ProcessedMessage();
		Message message = messageService.getMessageByMessageId(messageId);
		pm.setMessage(message);
		User user = userService.getUserById(message.getMessagepublisher());
		UserBaseMessage ubm = getUserBaseMessage(user);
		pm.setUbm(ubm);
		pm.setMessage(message);
		List<Picture> pictures = new ArrayList<Picture>();
		Integer[] pictureIds = new Integer[] {message.getMessagepictureid1(), message.getMessagepictureid2(), message.getMessagepictureid3()};
		for(Integer pictureId : pictureIds) {
			if(pictureId != null) {
				Picture picture = pictureService.getPictureByPictureId(pictureId);
				if(picture != null)
					pictures.add(picture);
			}
		}
		pm.setPictures(pictures);
		List<Comment> comments = commentService.getCommentsByMessageId(messageId);
		List<CommentBaseMessage> cbms = new ArrayList<CommentBaseMessage>();
		for(Comment comment : comments) {
			cbms.add(getCommentBaseMessage(comment));
		}
		pm.setCbms(cbms);
		List<Likes> likess = likesService.getLikessByMessageId(messageId);
		List<UserBaseMessage> likesubms = new ArrayList<UserBaseMessage>();
		for(Likes likes : likess) {
			if(likes != null) {
				User u = userService.getUserById(likes.getLikeuserid());
				if(u != null) {
					UserBaseMessage likesubm = getUserBaseMessage(u); 
					if(likesubm != null)
						likesubms.add(likesubm);
				}	
			}
		}
		pm.setLikesubms(likesubms);
		Long forwardTimes = forwardService.getForwardTimesByMessageId(messageId);
		pm.setForwardTimes(forwardTimes);
		return pm;
	}

	@Override
	public CommentBaseMessage getCommentBaseMessage(@NotNull Comment comment) {
		CommentBaseMessage cbm = new CommentBaseMessage(comment);
		User user = userService.getUserById(comment.getCommentpublisher());
		UserBaseMessage ubm = getUserBaseMessage(user);
		cbm.setUbm(ubm);
		return cbm;
	}

	@Override
	public void getPageMessageByUserId(@NotNull Integer userId, @NotNull Integer pageNumber, Map<String, Object> map) {
		//Map<String, Object> map = new HashMap<String, Object>();
		
		//获取用户基本信息，用于头像等基本信息的输出
		User user = userService.getUserById(userId);
		UserBaseMessage ubm = getUserBaseMessage(user);
		
		//获取关注，粉丝，收藏，微博的数量num1-num4
		Long num1 = relationService.getBeFollowRelationNumberByUserId(userId);
		Long num2 = relationService.getFollowRelationNumberByUserId(userId);
		Long num3 = collectionService.getCollectionNumberByUserId(userId);
		Long num4 = messageService.getMessageNumberByUserId(userId);
		
		//获取最近访客的信息
		List<Integer> visiterIds =  visitService.getVisitersIdByUserId(userId);
		List<UserBaseMessage> visiters = getUserBaseMessageByUserIdsList(visiterIds);
		
		//获取朋友的信息
		List<Relation> friendRelations = relationService.getFriendRelationByUserId(userId);
		List<UserBaseMessage> friends = new ArrayList<UserBaseMessage>();
		for(Relation relation : friendRelations) {
			User u = null;
			if(relation.getRelationbefollowuserid() != userId) {
				u = userService.getUserById(relation.getRelationbefollowuserid());
			}else {
				u = userService.getUserById(relation.getRelationfollowuserid());
			}
			
			if(u != null) {
				UserBaseMessage ubm2 = getUserBaseMessage(u);
				if(ubm2 != null) {
					friends.add(ubm2);
				}
			}
		}
		
		//获取用户的微博的信息，根据pageNumber获取不同类型的微博
		List<Message> messages = getAllMessagesByUserIdAndPageNumber(userId, pageNumber);
		List<ProcessedMessage> pms = new ArrayList<ProcessedMessage>();
		if(messages.size() >= 1) {
			for(Message message : messages) {
				pms.add(getProcessedMessageByMessageId(message.getMessageid()));
			}
		}
		//获取每一次用户的关注信息
		List<Integer> befollowids = null;
		User loginUser = (User) map.get("user");
		//System.out.println(loginUser);
		if(loginUser != null) {
			befollowids = relationService.getBeFollowUserIdsByUserId(loginUser.getUserid()); 
			//System.out.println(befollowids.toString());
		}
		
		map.put("ubm", ubm);
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("num3", num3);
		map.put("num4", num4);
		map.put("visiters", visiters);
		map.put("friends", friends);
		map.put("pms", pms);
		map.put("pagenumber", pageNumber);
		map.put("befollowids", befollowids);
	}

	private List<Message> getAllMessagesByUserIdAndPageNumber(@NotNull Integer userId, @NotNull Integer pageNumber) {
		List<Message> messages = new ArrayList<>();;
		if(pageNumber == 1) {
			messages = messageService.getMessagesByUserId(userId);
		}else if(pageNumber == 2) {
			List<Likes> likess = likesService.getLikesByUserId(userId);
			for(Likes likes : likess) {
				Message message = messageService.getMessageByMessageId(likes.getLikemessageid());
				messages.add(message);
			}
		}else if(pageNumber == 3){
			List<Collection> collections = collectionService.getCollectionsByUserId(userId);
			for(Collection collection : collections) {
				Message message = messageService.getMessageByMessageId(collection.getCollectmessageid());
				if(message != null) {
					messages.add(message);
				}
			}
		}else if(pageNumber == 4){
			List<Relation> friendRelations = relationService.getFriendRelationByUserId(userId);
			List<Message> temp = null;
			for(int i = 0; i < friendRelations.size(); i++) {
				if(friendRelations.get(i).getRelationfollowuserid() != userId) {
					temp = messageService.getMessagesByUserId(friendRelations.get(i).getRelationfollowuserid());
				}else {
					temp = messageService.getMessagesByUserId(friendRelations.get(i).getRelationbefollowuserid());
				}
				messages.addAll(temp);
				temp.clear();
			}
		}
		Collections.reverse(messages);
		return messages;
	}
}
