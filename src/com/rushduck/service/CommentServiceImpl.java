package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Comment;
import com.rushduck.bean.CommentExample;
import com.rushduck.mapper.CommentMapper;

public class CommentServiceImpl implements CommentService{
	private CommentMapper commentMapper;

	public void setCommentMapper(CommentMapper commentMapper) {
		this.commentMapper = commentMapper;
	}

	@Override
	public List<Comment> getCommentsByMessageId(Integer messageId) {
		CommentExample example = new CommentExample();
		example.createCriteria().andCommentmessageidEqualTo(messageId);
		List<Comment> comments = commentMapper.selectByExample(example);
		return comments;
	}
	
}
