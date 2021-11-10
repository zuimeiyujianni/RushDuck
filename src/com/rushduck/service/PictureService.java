package com.rushduck.service;

import com.rushduck.bean.Picture;

public interface PictureService {
	//根据图片ID获取图片
	public Picture getPictureByPictureId(Integer pcitureId);
	//插入图片信息
	public boolean insertPicture(Picture picture);
}
