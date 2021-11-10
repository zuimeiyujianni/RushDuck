package com.rushduck.bean;

import java.util.Date;

public class Relation {
    private Integer relationid;

    private Date relationcreatetime;

    private Integer relationfollowuserid;

    private Integer relationbefollowuserid;
    //Ö»ÄÜÊÇfriend or follow
    private String relationtype;

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Date getRelationcreatetime() {
        return relationcreatetime;
    }

    public void setRelationcreatetime(Date relationcreatetime) {
        this.relationcreatetime = relationcreatetime;
    }

    public Integer getRelationfollowuserid() {
        return relationfollowuserid;
    }

    public void setRelationfollowuserid(Integer relationfollowuserid) {
        this.relationfollowuserid = relationfollowuserid;
    }

    public Integer getRelationbefollowuserid() {
        return relationbefollowuserid;
    }

    public void setRelationbefollowuserid(Integer relationbefollowuserid) {
        this.relationbefollowuserid = relationbefollowuserid;
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype == null ? null : relationtype.trim();
    }

	@Override
	public String toString() {
		return "Relation [relationid=" + relationid + ", relationcreatetime=" + relationcreatetime
				+ ", relationfollowuserid=" + relationfollowuserid + ", relationbefollowuserid="
				+ relationbefollowuserid + ", relationtype=" + relationtype + "]";
	}
}