package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Message;

public interface MessageService {
	//�����û�ID��ȡ���û�������΢�������û���΢�������ǳ����ʱ��Ч�ʲ���ǳ��ã���Ҫ�����Ż���
	public List<Message> getMessagesByUserId(Integer userId); 
	//�����û�ID��ȡ���û��ĵ�΢��������
	public Long getMessageNumberByUserId(Integer userId);
	//����messageID��ȡ��΢������Ϣ
	public Message getMessageByMessageId(Integer messageId);
	//����һ��message
	public boolean addMessage(Message message);
}
