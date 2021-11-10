package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Relation;
public interface RelationService {
	//找到某个用户ID的朋友关系，即互相关注的关系
	public List<Relation> getFriendRelationByUserId(Integer userId);
	//找到某个用户ID关注的人的关系，即该ID用户是谁的粉丝
	public List<Relation> getBeFollowRelationsByUserId(Integer userId);
	//找到某个用户ID关注的人的id列表
	public List<Integer> getBeFollowUserIdsByUserId(Integer userId);
	//找到某个用户ID关注的人的数量，即该ID用户关注的数量
	public Long getBeFollowRelationNumberByUserId(Integer userId);
	//根据某个用户ID，找到关注这个用户ID的人的关系
	public List<Relation> getFollowRelationsByUserId(Integer userId);
	//根据某个用户ID查询关注某个用户的  关系的数量（关注该用户的人数）
	public Long getFollowRelationNumberByUserId(Integer userId);
	//添加关注的关系（加关注的操作）
	public boolean addFollowRelation(Integer relationFollowUserId, Integer relationBeFollowUserId);
	//取消关注的关注（取消关注的操作）
	public boolean removeFollowRelation(Integer relationFollowUserId, Integer relationBeFollowUserId);
}
