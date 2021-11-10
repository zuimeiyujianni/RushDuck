package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Message;
import com.rushduck.bean.MessageExample;
import com.rushduck.mapper.MessageMapper;

public class MessageServiceImpl implements MessageService{
	private MessageMapper messageMapper;

	public void setMessageMapper(MessageMapper messageMapper) {
		this.messageMapper = messageMapper;
	}

	@Override
	public List<Message> getMessagesByUserId(Integer userId) {
		MessageExample example = new MessageExample();
		example.createCriteria().andMessagepublisherEqualTo(userId);
		List<Message> messages = messageMapper.selectByExample(example);
		return messages;
	}
	
	@Override
	public Long getMessageNumberByUserId(Integer userId) {
		MessageExample example = new MessageExample();
		example.createCriteria().andMessagepublisherEqualTo(userId);
		Long num = messageMapper.countByExample(example);
		return num;
	}

	@Override
	public Message getMessageByMessageId(Integer messageId) {
		Message message = messageMapper.selectByPrimaryKey(messageId);
		return message;
	}

	@Override
	public boolean addMessage(Message message) {
		int num = messageMapper.insert(message);
		return num == 0 ? false : true;
	}
}
