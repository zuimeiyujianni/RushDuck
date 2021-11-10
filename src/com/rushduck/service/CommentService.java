package com.rushduck.service;

import java.util.List;

import com.rushduck.bean.Comment;

public interface CommentService {
	public List<Comment> getCommentsByMessageId(Integer messageId);
}
