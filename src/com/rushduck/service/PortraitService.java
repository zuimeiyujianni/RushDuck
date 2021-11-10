package com.rushduck.service;

import com.rushduck.bean.Portrait;

public interface PortraitService {
	public Portrait getPortraitById(Integer portraitId);
	
	public boolean addPortrait(Portrait portrait);
}
