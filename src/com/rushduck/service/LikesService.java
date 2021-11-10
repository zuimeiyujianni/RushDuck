package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Likes;

public interface LikesService {
	//根据messageId获取所有的喜欢的信息
	public List<Likes> getLikessByMessageId(Integer messageId);
	//插入likes信息
	public boolean addLikesMessage(Likes likes);
	//根据用户userId获取所有的点赞喜欢
	public List<Likes> getLikesByUserId(Integer userId);
}
