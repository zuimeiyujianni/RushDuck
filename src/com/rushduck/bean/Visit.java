package com.rushduck.bean;

public class Visit {
    private Integer visitid;

    private Integer visiterid;

    private Integer bevisitedid;
    
    public Visit() { }

	public Visit(Integer visitid, Integer visiterid, Integer bevisitedid) {
		this.visitid = visitid;
		this.visiterid = visiterid;
		this.bevisitedid = bevisitedid;
	}

	public Integer getVisitid() {
        return visitid;
    }

    public void setVisitid(Integer visitid) {
        this.visitid = visitid;
    }

    public Integer getVisiterid() {
        return visiterid;
    }

    public void setVisiterid(Integer visiterid) {
        this.visiterid = visiterid;
    }

    public Integer getBevisitedid() {
        return bevisitedid;
    }

    public void setBevisitedid(Integer bevisitedid) {
        this.bevisitedid = bevisitedid;
    }

	@Override
	public String toString() {
		return "Visit [visitid=" + visitid + ", visiterid=" + visiterid + ", bevisitedid=" + bevisitedid + "]";
	}
}