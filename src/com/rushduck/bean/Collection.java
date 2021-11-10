package com.rushduck.bean;

public class Collection {
    private Integer collectid;

    private Integer collectuserid;

    private Integer collectmessageid;

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public Integer getCollectuserid() {
        return collectuserid;
    }

    public void setCollectuserid(Integer collectuserid) {
        this.collectuserid = collectuserid;
    }

    public Integer getCollectmessageid() {
        return collectmessageid;
    }

    public void setCollectmessageid(Integer collectmessageid) {
        this.collectmessageid = collectmessageid;
    }

	@Override
	public String toString() {
		return "Collection [collectid=" + collectid + ", collectuserid=" + collectuserid + ", collectmessageid="
				+ collectmessageid + "]";
	}
}