package com.rushduck.mapper;

import com.rushduck.bean.Relation;
import com.rushduck.bean.RelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationMapper {
    long countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(Integer relationid);

    int insert(Relation record);

    int insertSelective(Relation record);

    List<Relation> selectByExample(RelationExample example);

    Relation selectByPrimaryKey(Integer relationid);

    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}