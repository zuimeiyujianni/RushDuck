package com.rushduck.service;

import com.rushduck.bean.Portrait;
import com.rushduck.mapper.PortraitMapper;

public class PortraitServiceImpl implements PortraitService{
	private PortraitMapper portraitMapper;

	public void setPortraitMapper(PortraitMapper portraitMapper) {
		this.portraitMapper = portraitMapper;
	}

	@Override
	public Portrait getPortraitById(Integer portraitId) {
		Portrait portrait = portraitMapper.selectByPrimaryKey(portraitId);
		return portrait;
	}

	@Override
	public boolean addPortrait(Portrait portrait) {
		int num = portraitMapper.insert(portrait);
		return num == 0 ? false : true;
	}
}
