package com.rushduck.service;

import com.rushduck.bean.Picture;

public interface PictureService {
	//����ͼƬID��ȡͼƬ
	public Picture getPictureByPictureId(Integer pcitureId);
	//����ͼƬ��Ϣ
	public boolean insertPicture(Picture picture);
}
