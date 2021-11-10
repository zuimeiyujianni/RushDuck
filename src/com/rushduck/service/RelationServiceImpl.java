package com.rushduck.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.rushduck.bean.Relation;
import com.rushduck.bean.RelationExample;
import com.rushduck.mapper.RelationMapper;
import com.sun.istack.internal.NotNull;

public class RelationServiceImpl implements RelationService{
	private RelationMapper relationMapper;

	public void setRelationMapper(RelationMapper relationMapper) {
		this.relationMapper = relationMapper;
	}

	@Override
	public List<Relation> getFriendRelationByUserId(@NotNull Integer userId) {
		//A && ( C || D ) ---> ( A && C ) || ( A && D)
		RelationExample example = new RelationExample();
		RelationExample.Criteria criteria1 = example.createCriteria();
		RelationExample.Criteria criteria2 = example.createCriteria();
		criteria1.andRelationtypeEqualTo("friend").andRelationfollowuseridEqualTo(userId);
		criteria2.andRelationtypeEqualTo("friend").andRelationbefollowuseridEqualTo(userId);
		example.or(criteria2);
		List<Relation> relations = relationMapper.selectByExample(example);
		return relations;
	}

	@Override
	public List<Relation> getFollowRelationsByUserId(@NotNull Integer userId) {
		RelationExample example = new RelationExample();
		RelationExample.Criteria criteria1 = example.createCriteria();
		RelationExample.Criteria criteria2 = example.createCriteria();
		RelationExample.Criteria criteria3 = example.createCriteria();
		criteria1.andRelationtypeEqualTo("follow").andRelationbefollowuseridEqualTo(userId);
		criteria2.andRelationtypeEqualTo("friend").andRelationbefollowuseridEqualTo(userId);
		criteria3.andRelationtypeEqualTo("friend").andRelationfollowuseridEqualTo(userId);
		example.or(criteria2);
		example.or(criteria3);
		List<Relation> relations = relationMapper.selectByExample(example);
		return relations;
	}
	
	@Override
	public List<Relation> getBeFollowRelationsByUserId(@NotNull Integer userId) {
		RelationExample example = new RelationExample();
		RelationExample.Criteria criteria1 = example.createCriteria();
		RelationExample.Criteria criteria2 = example.createCriteria();
		RelationExample.Criteria criteria3 = example.createCriteria();
		criteria1.andRelationtypeEqualTo("follow").andRelationfollowuseridEqualTo(userId);
		criteria2.andRelationtypeEqualTo("friend").andRelationbefollowuseridEqualTo(userId);
		criteria3.andRelationtypeEqualTo("friend").andRelationfollowuseridEqualTo(userId);
		example.or(criteria2);
		example.or(criteria3);
		List<Relation> relations = relationMapper.selectByExample(example);
		return relations;
	}

	@Override
	public Long getBeFollowRelationNumberByUserId(@NotNull Integer userId) {
		RelationExample example = new RelationExample();
		RelationExample.Criteria criteria1 = example.createCriteria();
		RelationExample.Criteria criteria2 = example.createCriteria();
		RelationExample.Criteria criteria3 = example.createCriteria();
		criteria1.andRelationtypeEqualTo("follow").andRelationfollowuseridEqualTo(userId);
		criteria2.andRelationtypeEqualTo("friend").andRelationbefollowuseridEqualTo(userId);
		criteria3.andRelationtypeEqualTo("friend").andRelationfollowuseridEqualTo(userId);
		example.or(criteria2);
		example.or(criteria3);
		Long number = relationMapper.countByExample(example);
		return number;
	}

	@Override
	public Long getFollowRelationNumberByUserId(@NotNull Integer userId) {
		RelationExample example = new RelationExample();
		RelationExample.Criteria criteria1 = example.createCriteria();
		RelationExample.Criteria criteria2 = example.createCriteria();
		RelationExample.Criteria criteria3 = example.createCriteria();
		criteria1.andRelationtypeEqualTo("follow").andRelationbefollowuseridEqualTo(userId);
		criteria2.andRelationtypeEqualTo("friend").andRelationbefollowuseridEqualTo(userId);
		criteria3.andRelationtypeEqualTo("friend").andRelationfollowuseridEqualTo(userId);
		example.or(criteria2);
		example.or(criteria3);
		
		Long numberOfFollow = relationMapper.countByExample(example);
		return numberOfFollow;
	}

	@Override
	public boolean addFollowRelation(@NotNull Integer relationFollowUserId, @NotNull Integer relationBeFollowUserId) {
		//�ж��Ƿ��Ѿ���ע
		RelationExample example1 = new RelationExample();
		RelationExample.Criteria criteria1 = example1.createCriteria();
		RelationExample.Criteria criteria2 = example1.createCriteria();
		RelationExample.Criteria criteria3 = example1.createCriteria();
		criteria1.andRelationfollowuseridEqualTo(relationFollowUserId).andRelationbefollowuseridEqualTo(relationBeFollowUserId).andRelationtypeEqualTo("follow");
		criteria2.andRelationfollowuseridEqualTo(relationFollowUserId).andRelationbefollowuseridEqualTo(relationBeFollowUserId).andRelationtypeEqualTo("friend");
		criteria3.andRelationfollowuseridEqualTo(relationBeFollowUserId).andRelationbefollowuseridEqualTo(relationFollowUserId).andRelationtypeEqualTo("friend");
		example1.or(criteria2);
		example1.or(criteria3);
		List<Relation> relations1 = relationMapper.selectByExample(example1);
		if(relations1.size() > 0)
			return true;
		
		//��û�й�ע���ж϶����Ƿ��Ѿ���ע�Լ�,�������Ѿ���ע�Լ����޸����ߵĹ�ϵΪ���ѹ�ϵ�������עΪ���ѹ�ϵ��
		RelationExample example2 = new RelationExample();
		example2.createCriteria().andRelationfollowuseridEqualTo(relationBeFollowUserId).andRelationbefollowuseridEqualTo(relationFollowUserId).andRelationtypeEqualTo("follow");
		List<Relation> relations2 = relationMapper.selectByExample(example2);
		if(relations2.size() > 0) {
			Relation record = new Relation();
			record.setRelationcreatetime(new Date());
			record.setRelationtype("friend");
			int num = relationMapper.updateByExampleSelective(record, example2);
			return num == 0 ? false : true;
		}
		
		//������û�й�ע�Լ�����ӹ�ע����Ϣ
		Relation relation = new Relation();
		relation.setRelationfollowuserid(relationFollowUserId);
		relation.setRelationbefollowuserid(relationBeFollowUserId);
		Calendar cal = Calendar.getInstance(); 
		Date date = cal.getTime();
		relation.setRelationcreatetime(date);
		relation.setRelationtype("follow");
		int num = relationMapper.insert(relation);
		return num == 0 ? false :true;
	}

	@Override
	public boolean removeFollowRelation(@NotNull Integer relationFollowUserId, @NotNull Integer relationBeFollowUserId) {
		//�ж��Ƿ�������ѹ�ϵ������������ѹ�ϵ�����³���ͨ�Ĺ�ע�Ĺ�ϵ������ֻ�Ǽ򵥵��޸Ĺ�ϵ���ͣ�ע���޸�֮�����ߵĹ�ϵ�����Ƿ���ȷ
		RelationExample example1 = new RelationExample();
		RelationExample.Criteria criteria1 = example1.createCriteria();
		RelationExample.Criteria criteria2 = example1.createCriteria();
		criteria1.andRelationfollowuseridEqualTo(relationFollowUserId).andRelationbefollowuseridEqualTo(relationBeFollowUserId).andRelationtypeEqualTo("friend");
		criteria2.andRelationfollowuseridEqualTo(relationBeFollowUserId).andRelationbefollowuseridEqualTo(relationFollowUserId).andRelationtypeEqualTo("friend");
		example1.or(criteria2);
		List<Relation> relations1 = relationMapper.selectByExample(example1);
		if(relations1.size() > 0) {
			Relation record = new Relation();
			record.setRelationfollowuserid(relationBeFollowUserId);
			record.setRelationbefollowuserid(relationFollowUserId);
			Calendar cal = Calendar.getInstance(); 
			Date date = cal.getTime();
			record.setRelationcreatetime(date);
			record.setRelationtype("follow");
			int num = relationMapper.updateByExampleSelective(record, example1);
			return num == 0 ? false : true;		
		}
		//û�����ѹ�ϵ������ڣ���ô�ж��Ƿ������Ҫ�Ƴ��Ĺ�ϵ�����û�У����سɹ�
		RelationExample example2 = new RelationExample();
		example2.createCriteria().andRelationfollowuseridEqualTo(relationFollowUserId).andRelationbefollowuseridEqualTo(relationBeFollowUserId).andRelationtypeEqualTo("follow");
		List<Relation> relations2 = relationMapper.selectByExample(example2);
		if(relations2.size() == 0) {
			return true;
		}
		//���������Ҫ�����Ƴ��Ĺ�ϵ���ж��Ƿ���ȷ�Ľ����Ƴ�
		int num = relationMapper.deleteByPrimaryKey(relations2.get(0).getRelationid());
		return num == 0 ? false : true;
	}

	@Override
	public List<Integer> getBeFollowUserIdsByUserId(Integer userId) {
		List<Integer> userids = new ArrayList<>();
		List<Relation> relations = getBeFollowRelationsByUserId(userId);
		for(Relation relation : relations) {
			if(relation.getRelationbefollowuserid() != userId) {
				userids.add(relation.getRelationbefollowuserid());
			}else {
				userids.add(relation.getRelationfollowuserid());
			}
		}
		return userids;
	}

}
