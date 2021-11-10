package com.rushduck.mapper;

import com.rushduck.bean.Likes;
import com.rushduck.bean.LikesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LikesMapper {
    long countByExample(LikesExample example);

    int deleteByExample(LikesExample example);

    int deleteByPrimaryKey(Integer likeid);

    int insert(Likes record);

    int insertSelective(Likes record);

    List<Likes> selectByExample(LikesExample example);

    Likes selectByPrimaryKey(Integer likeid);

    int updateByExampleSelective(@Param("record") Likes record, @Param("example") LikesExample example);

    int updateByExample(@Param("record") Likes record, @Param("example") LikesExample example);

    int updateByPrimaryKeySelective(Likes record);

    int updateByPrimaryKey(Likes record);
}