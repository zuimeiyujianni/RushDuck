package com.rushduck.service;

import java.util.List;
import java.util.Map;

import com.rushduck.bean.Comment;
import com.rushduck.bean.CommentBaseMessage;
import com.rushduck.bean.ProcessedMessage;
import com.rushduck.bean.User;
import com.rushduck.bean.UserBaseMessage;
import com.sun.istack.internal.NotNull;

public interface BaseService {
	//根据用户对象获取基本信息对象
	UserBaseMessage getUserBaseMessage(@NotNull User user);
	
	//根据评论获取评论基本信息
	CommentBaseMessage getCommentBaseMessage(@NotNull Comment comment);
	
	//根据用户对象列表获取基本信息对象列表
	List<UserBaseMessage> getUserBaseMessageByUserList(@NotNull List<User> users);
	
	//根据用户ID列表获取基本信息对象列表
	List<UserBaseMessage> getUserBaseMessageByUserIdsList(@NotNull List<Integer> userIds);
	
	//根据message获取处理之后的proccessedMessage
	ProcessedMessage getProcessedMessageByMessageId(@NotNull Integer messageId);
	
	//根据用户ID获取某个用户主页的信息,pageNumber用于指定获取什么样类型的Message，是ta的动态，ta的收藏的动态，还是ta点赞喜欢的动态，pageNumber有0，1，2
	void getPageMessageByUserId(@NotNull Integer userId, @NotNull Integer pageNumber, Map<String, Object> map);
}
