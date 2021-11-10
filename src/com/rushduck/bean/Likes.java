package com.rushduck.bean;

public class Likes {
    private Integer likeid;

    private Integer likemessageid;

    private Integer likeuserid;

    public Integer getLikeid() {
        return likeid;
    }

    public void setLikeid(Integer likeid) {
        this.likeid = likeid;
    }

    public Integer getLikemessageid() {
        return likemessageid;
    }

    public void setLikemessageid(Integer likemessageid) {
        this.likemessageid = likemessageid;
    }

    public Integer getLikeuserid() {
        return likeuserid;
    }

    public void setLikeuserid(Integer likeuserid) {
        this.likeuserid = likeuserid;
    }

	@Override
	public String toString() {
		return "Likes [likeid=" + likeid + ", likemessageid=" + likemessageid + ", likeuserid=" + likeuserid + "]";
	}
}