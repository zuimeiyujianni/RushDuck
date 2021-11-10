package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Collection;
import com.rushduck.bean.CollectionExample;
import com.rushduck.mapper.CollectionMapper;
import com.sun.istack.internal.NotNull;

public class CollectionServiceImpl implements CollectionService{
	private CollectionMapper collectionMapper;

	public void setCollectionMapper(CollectionMapper collectionMapper) {
		this.collectionMapper = collectionMapper;
	}

	@Override
	public List<Collection> getCollectionsByUserId(@NotNull Integer userId) {
		CollectionExample example = new CollectionExample();
		example.createCriteria().andCollectuseridEqualTo(userId);
		List<Collection> collections = collectionMapper.selectByExample(example);
		return collections;
	}

	@Override
	public Long getCollectionNumberByUserId(Integer userId) {
		CollectionExample example = new CollectionExample();
		example.createCriteria().andCollectuseridEqualTo(userId);
		Long nums = collectionMapper.countByExample(example);
		return nums;
	}

	@Override
	public boolean isExist(@NotNull Integer collectMessageId, @NotNull Integer collectUserId) {
		CollectionExample example = new CollectionExample();
		example.createCriteria().andCollectmessageidEqualTo(collectMessageId).andCollectuseridEqualTo(collectUserId);
		Long nums = collectionMapper.countByExample(example);
		return nums > 0 ? true : false;
	}

	@Override
	public boolean addCollection(Integer collectionMessageId, Integer collectionUserId) {
		if(isExist(collectionMessageId, collectionUserId)) {
			//����Ѿ������������ղصļ�¼
			System.out.println("��¼�Ѿ�����");
			return true;
		}
		Collection collection = new Collection();
		collection.setCollectmessageid(collectionMessageId);
		collection.setCollectuserid(collectionUserId);
		int num = collectionMapper.insert(collection);
		System.out.println("�����ղز����յ�Ӱ������� ��  " + num);
		return num > 0 ? true : false;
	}

	@Override
	public boolean removeCollection(Integer collectionMessageId, Integer collectionUserId) {
		if(isExist(collectionMessageId, collectionUserId) == false) {
			//���û�д��������ղصļ�¼
			System.out.println("��¼������");
			return true;
		}
		CollectionExample example = new CollectionExample();
		example.createCriteria().andCollectmessageidEqualTo(collectionMessageId).andCollectuseridEqualTo(collectionUserId);
		int num = collectionMapper.deleteByExample(example);
		System.out.println("ɾ���ղز���Ӱ������� ��  " + num);
		return num > 0 ? true : false;
	}

}
