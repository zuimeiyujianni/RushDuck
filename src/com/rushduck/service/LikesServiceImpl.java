package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Likes;
import com.rushduck.bean.LikesExample;
import com.rushduck.mapper.LikesMapper;

public class LikesServiceImpl implements LikesService{
	private LikesMapper likesMapper;

	public void setLikesMapper(LikesMapper likesMapper) {
		this.likesMapper = likesMapper;
	}

	@Override
	public List<Likes> getLikessByMessageId(Integer messageId) {
		LikesExample example = new LikesExample();
		example.createCriteria().andLikemessageidEqualTo(messageId);
		List<Likes> likess = likesMapper.selectByExample(example);
		return likess;
	}

	@Override
	public boolean addLikesMessage(Likes likes) {
		int num = likesMapper.insert(likes);
		return num == 0 ? false : true;
	}

	@Override
	public List<Likes> getLikesByUserId(Integer userId) {
		LikesExample example = new LikesExample();
		example.createCriteria().andLikeuseridEqualTo(userId);
		List<Likes> likess = likesMapper.selectByExample(example);
		return likess;
	}
}
