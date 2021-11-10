package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Music;
import com.rushduck.bean.MusicExample;
import com.rushduck.mapper.MusicMapper;

public class MusicServiceImpl implements MusicService{
	private MusicMapper musicMapper;
	
	public void setMusicMapper(MusicMapper musicMapper) {
		this.musicMapper = musicMapper;
	}

	@Override
	public Music getMusicByMusicId(Integer musicId) {
		MusicExample example = new MusicExample();
		example.createCriteria().andMusicidEqualTo(musicId);
		List<Music> musics = musicMapper.selectByExample(example);
		return musics.size() == 0 ? null : musics.get(0);
	}
}
