package com.rushduck.service;

import com.rushduck.bean.Music;
import com.sun.istack.internal.NotNull;

public interface MusicService {
	//查找某个musicId的信息
	public Music getMusicByMusicId(Integer musicId);
}
