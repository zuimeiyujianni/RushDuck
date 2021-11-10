package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Relation;
public interface RelationService {
	//�ҵ�ĳ���û�ID�����ѹ�ϵ���������ע�Ĺ�ϵ
	public List<Relation> getFriendRelationByUserId(Integer userId);
	//�ҵ�ĳ���û�ID��ע���˵Ĺ�ϵ������ID�û���˭�ķ�˿
	public List<Relation> getBeFollowRelationsByUserId(Integer userId);
	//�ҵ�ĳ���û�ID��ע���˵�id�б�
	public List<Integer> getBeFollowUserIdsByUserId(Integer userId);
	//�ҵ�ĳ���û�ID��ע���˵�����������ID�û���ע������
	public Long getBeFollowRelationNumberByUserId(Integer userId);
	//����ĳ���û�ID���ҵ���ע����û�ID���˵Ĺ�ϵ
	public List<Relation> getFollowRelationsByUserId(Integer userId);
	//����ĳ���û�ID��ѯ��עĳ���û���  ��ϵ����������ע���û���������
	public Long getFollowRelationNumberByUserId(Integer userId);
	//��ӹ�ע�Ĺ�ϵ���ӹ�ע�Ĳ�����
	public boolean addFollowRelation(Integer relationFollowUserId, Integer relationBeFollowUserId);
	//ȡ����ע�Ĺ�ע��ȡ����ע�Ĳ�����
	public boolean removeFollowRelation(Integer relationFollowUserId, Integer relationBeFollowUserId);
}
