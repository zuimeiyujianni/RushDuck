package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Visit;
import com.sun.istack.internal.NotNull;

public interface VisitService {
	//���һ�����ʼ�¼
	boolean addVisitRecord(@NotNull Integer visterId, @NotNull Integer beVisitedId);
	
	//����ĳ��useId�����з�����
	List<Integer> getVisitersIdByUserId(@NotNull Integer userId);
	
	//����ĳ��userId�����з�����Ϣ
	List<Visit> getVisitsByUserId(@NotNull Integer userId);
}
