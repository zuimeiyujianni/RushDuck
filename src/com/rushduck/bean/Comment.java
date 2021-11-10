package com.rushduck.bean;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private String commentinfo;

    private Date commenttime;

    private Integer commentpublisher;

    private Integer commentmessageid;

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
        this.commentinfo = commentinfo == null ? null : commentinfo.trim();
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

	@Override
	public String toString() {
		return "Comment [commentid=" + commentid + ", commentinfo=" + commentinfo + ", commenttime=" + commenttime
				+ ", commentpublisher=" + commentpublisher + ", commentmessageid=" + commentmessageid + "]";
	}
}