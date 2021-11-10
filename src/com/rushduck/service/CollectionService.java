package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Collection;

public interface CollectionService {
	//根据用户ID获取该用户的所有收藏的信息
	List<Collection> getCollectionsByUserId(Integer userId);
	//根据用户ID获取该用户收藏的数量
	Long getCollectionNumberByUserId(Integer userId);
	//判断某个收藏的信息是否已经存在
	boolean isExist(Integer collectMessageId, Integer collectUserId);
	//判断插入收藏的信息
	boolean addCollection(Integer collectionMessageId, Integer collectionUserId);
	//移除收藏的信息
	boolean removeCollection(Integer collectionMessageId, Integer collectionUserId);
}
