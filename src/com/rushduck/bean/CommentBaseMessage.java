package com.rushduck.bean;

import java.util.Date;

public class CommentBaseMessage {
	private Integer commentid;

    private String commentinfo;

    private Date commenttime;

    private Integer commentpublisher;

    private Integer commentmessageid; 
    //用户的基本信息，方便展示
    private UserBaseMessage ubm;
    
	public CommentBaseMessage(Comment comment) {
		this.commentid = comment.getCommentid();
		this.commentinfo = comment.getCommentinfo();
		this.commenttime = comment.getCommenttime();
		this.commentpublisher = comment.getCommentpublisher();
		this.commentmessageid = comment.getCommentmessageid();
	}

	public Integer getCommentid() {
		return commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public String getCommentinfo() {
		return commentinfo;
	}

	public void setCommentinfo(String commentinfo) {
		this.commentinfo = commentinfo;
	}

	public Date getCommenttime() {
		return commenttime;
	}

	public void setCommenttime(Date commenttime) {
		this.commenttime = commenttime;
	}

	public Integer getCommentpublisher() {
		return commentpublisher;
	}

	public void setCommentpublisher(Integer commentpublisher) {
		this.commentpublisher = commentpublisher;
	}

	public Integer getCommentmessageid() {
		return commentmessageid;
	}

	public void setCommentmessageid(Integer commentmessageid) {
		this.commentmessageid = commentmessageid;
	}

	public UserBaseMessage getUbm() {
		return ubm;
	}

	public void setUbm(UserBaseMessage ubm) {
		this.ubm = ubm;
	}
}
