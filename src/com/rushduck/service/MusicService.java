package com.rushduck.service;

import com.rushduck.bean.Music;
import com.sun.istack.internal.NotNull;

public interface MusicService {
	//����ĳ��musicId����Ϣ
	public Music getMusicByMusicId(Integer musicId);
}
