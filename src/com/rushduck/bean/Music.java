package com.rushduck.bean;

public class Music {
    private Integer musicid;

    private String musicurl;

    private String musictype;

    private String musicname;

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }

    public String getMusicurl() {
        return musicurl;
    }

    public void setMusicurl(String musicurl) {
        this.musicurl = musicurl == null ? null : musicurl.trim();
    }

    public String getMusictype() {
        return musictype;
    }

    public void setMusictype(String musictype) {
        this.musictype = musictype == null ? null : musictype.trim();
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

	@Override
	public String toString() {
		return "Music [musicid=" + musicid + ", musicurl=" + musicurl + ", musictype=" + musictype + ", musicname="
				+ musicname + "]";
	}
}