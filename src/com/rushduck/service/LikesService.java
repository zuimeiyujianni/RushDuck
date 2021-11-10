package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Likes;

public interface LikesService {
	//����messageId��ȡ���е�ϲ������Ϣ
	public List<Likes> getLikessByMessageId(Integer messageId);
	//����likes��Ϣ
	public boolean addLikesMessage(Likes likes);
	//�����û�userId��ȡ���еĵ���ϲ��
	public List<Likes> getLikesByUserId(Integer userId);
}
