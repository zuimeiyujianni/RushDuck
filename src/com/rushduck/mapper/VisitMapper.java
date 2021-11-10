package com.rushduck.mapper;

import com.rushduck.bean.Visit;
import com.rushduck.bean.VisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitMapper {
    long countByExample(VisitExample example);

    int deleteByExample(VisitExample example);

    int deleteByPrimaryKey(Integer visitid);

    int insert(Visit record);

    int insertSelective(Visit record);

    List<Visit> selectByExample(VisitExample example);

    Visit selectByPrimaryKey(Integer visitid);

    int updateByExampleSelective(@Param("record") Visit record, @Param("example") VisitExample example);

    int updateByExample(@Param("record") Visit record, @Param("example") VisitExample example);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);
}