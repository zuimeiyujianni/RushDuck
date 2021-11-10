package com.rushduck.service;

import com.rushduck.bean.Picture;
import com.rushduck.mapper.PictureMapper;
import com.sun.istack.internal.NotNull;

public class PictureServiceImpl implements PictureService{
	private PictureMapper pictureMapper;
	
	public void setPictureMapper(PictureMapper pictureMapper) {
		this.pictureMapper = pictureMapper;
	}
	
	@Override
	public Picture getPictureByPictureId(@NotNull Integer pictureId) {
		Picture picture = pictureMapper.selectByPrimaryKey(pictureId);
		return picture;
	}

	@Override
	public boolean insertPicture(Picture picture) {
		int num = pictureMapper.insert(picture);
		return num == 0 ? false : true;
	}
}
