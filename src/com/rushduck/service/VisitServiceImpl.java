package com.rushduck.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rushduck.bean.Visit;
import com.rushduck.bean.VisitExample;
import com.rushduck.mapper.VisitMapper;
import com.sun.istack.internal.NotNull;

public class VisitServiceImpl implements VisitService{
	//提供DAO层服务
	private VisitMapper visitMapper;

	public void setVisitMapper(VisitMapper visitMapper) {
		this.visitMapper = visitMapper;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = false)
	public boolean addVisitRecord(@NotNull Integer visiterId, @NotNull Integer beVisitedId) {
		//返回受影响的行数
		int num = visitMapper.insert(new Visit(null, visiterId, beVisitedId));
		return num == 1 ? true : false;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = true)
	public List<Integer> getVisitersIdByUserId(@NotNull Integer userId) {
		List<Integer> res = new ArrayList<Integer>();
		List<Visit> visiters = getVisitsByUserId(userId);
		for(Visit visiter : visiters)
			res.add(visiter.getVisiterid());
		return res;
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, readOnly = true)
	public List<Visit> getVisitsByUserId(@NotNull Integer userId) {
		VisitExample example = new VisitExample();
		example.createCriteria().andBevisitedidEqualTo(userId);
		List<Visit> visiters = visitMapper.selectByExample(example);
		return visiters;
	}
}
