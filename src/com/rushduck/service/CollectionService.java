package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Collection;

public interface CollectionService {
	//�����û�ID��ȡ���û��������ղص���Ϣ
	List<Collection> getCollectionsByUserId(Integer userId);
	//�����û�ID��ȡ���û��ղص�����
	Long getCollectionNumberByUserId(Integer userId);
	//�ж�ĳ���ղص���Ϣ�Ƿ��Ѿ�����
	boolean isExist(Integer collectMessageId, Integer collectUserId);
	//�жϲ����ղص���Ϣ
	boolean addCollection(Integer collectionMessageId, Integer collectionUserId);
	//�Ƴ��ղص���Ϣ
	boolean removeCollection(Integer collectionMessageId, Integer collectionUserId);
}
