package com.rushduck.bean;

public class Picture {
    private Integer pictureid;

    private String picturetype;

    private String pictureurl;

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getPicturetype() {
        return picturetype;
    }

    public void setPicturetype(String picturetype) {
        this.picturetype = picturetype == null ? null : picturetype.trim();
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }
}