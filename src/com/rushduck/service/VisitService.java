package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Visit;
import com.sun.istack.internal.NotNull;

public interface VisitService {
	//添加一条访问记录
	boolean addVisitRecord(@NotNull Integer visterId, @NotNull Integer beVisitedId);
	
	//给出某个useId的所有访问者
	List<Integer> getVisitersIdByUserId(@NotNull Integer userId);
	
	//给出某个userId的所有访问信息
	List<Visit> getVisitsByUserId(@NotNull Integer userId);
}
