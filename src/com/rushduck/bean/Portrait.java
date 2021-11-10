package com.rushduck.bean;

public class Portrait {
    private Integer portraitid;

    private String portraiturl;

    private String portraittype;

    public Integer getPortraitid() {
        return portraitid;
    }

    public void setPortraitid(Integer portraitid) {
        this.portraitid = portraitid;
    }

    public String getPortraiturl() {
        return portraiturl;
    }

    public void setPortraiturl(String portraiturl) {
        this.portraiturl = portraiturl == null ? null : portraiturl.trim();
    }

    public String getPortraittype() {
        return portraittype;
    }

    public void setPortraittype(String portraittype) {
        this.portraittype = portraittype == null ? null : portraittype.trim();
    }

	@Override
	public String toString() {
		return "Portrait [portraitid=" + portraitid + ", portraiturl=" + portraiturl + ", portraittype=" + portraittype
				+ "]";
	}
}