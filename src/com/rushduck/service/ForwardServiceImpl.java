package com.rushduck.service;

import com.rushduck.bean.ForwardExample;
import com.rushduck.mapper.ForwardMapper;

public class ForwardServiceImpl implements ForwardService{
	private ForwardMapper forwardMapper;
	
	public void setForwardMapper(ForwardMapper forwardMapper) {
		this.forwardMapper = forwardMapper;
	}

	@Override
	public Long getForwardTimesByMessageId(Integer messageId) {
		ForwardExample example = new ForwardExample();
		example.createCriteria().andForwardmessageidEqualTo(messageId);
		Long forwardTimes = forwardMapper.countByExample(example);
		return forwardTimes;
	}
}
