package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Message;

public interface MessageService {
	//根据用户ID获取该用户的所有微博（当用户的微博数量非常大的时候，效率不会非常好，需要进行优化）
	public List<Message> getMessagesByUserId(Integer userId); 
	//根据用户ID获取该用户的的微博的数量
	public Long getMessageNumberByUserId(Integer userId);
	//根据messageID获取该微博的信息
	public Message getMessageByMessageId(Integer messageId);
	//插入一条message
	public boolean addMessage(Message message);
}
