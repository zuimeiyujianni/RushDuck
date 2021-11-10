package com.rushduck.mapper;

import com.rushduck.bean.Picture;
import com.rushduck.bean.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Integer pictureid);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Integer pictureid);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}