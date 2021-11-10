package com.rushduck.mapper;

import com.rushduck.bean.Portrait;
import com.rushduck.bean.PortraitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortraitMapper {
    long countByExample(PortraitExample example);

    int deleteByExample(PortraitExample example);

    int deleteByPrimaryKey(Integer portraitid);

    int insert(Portrait record);

    int insertSelective(Portrait record);

    List<Portrait> selectByExample(PortraitExample example);

    Portrait selectByPrimaryKey(Integer portraitid);

    int updateByExampleSelective(@Param("record") Portrait record, @Param("example") PortraitExample example);

    int updateByExample(@Param("record") Portrait record, @Param("example") PortraitExample example);

    int updateByPrimaryKeySelective(Portrait record);

    int updateByPrimaryKey(Portrait record);
}