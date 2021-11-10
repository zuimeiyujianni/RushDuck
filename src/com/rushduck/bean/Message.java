package com.rushduck.bean;

import java.util.Date;

public class Message {
    private Integer messageid;

    private String messagetype;

    private Date messagetime;

    private String messageinfo;

    private Integer messagereadingtimes;

    private Integer messagepublisher;

    private Integer messagepictureid1;

    private Integer messagepictureid2;

    private Integer messagepictureid3;

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }

    public Date getMessagetime() {
        return messagetime;
    }

    public void setMessagetime(Date messagetime) {
        this.messagetime = messagetime;
    }

    public String getMessageinfo() {
        return messageinfo;
    }

    public void setMessageinfo(String messageinfo) {
        this.messageinfo = messageinfo == null ? null : messageinfo.trim();
    }

    public Integer getMessagereadingtimes() {
        return messagereadingtimes;
    }

    public void setMessagereadingtimes(Integer messagereadingtimes) {
        this.messagereadingtimes = messagereadingtimes;
    }

    public Integer getMessagepublisher() {
        return messagepublisher;
    }

    public void setMessagepublisher(Integer messagepublisher) {
        this.messagepublisher = messagepublisher;
    }

    public Integer getMessagepictureid1() {
        return messagepictureid1;
    }

    public void setMessagepictureid1(Integer messagepictureid1) {
        this.messagepictureid1 = messagepictureid1;
    }

    public Integer getMessagepictureid2() {
        return messagepictureid2;
    }

    public void setMessagepictureid2(Integer messagepictureid2) {
        this.messagepictureid2 = messagepictureid2;
    }

    public Integer getMessagepictureid3() {
        return messagepictureid3;
    }

    public void setMessagepictureid3(Integer messagepictureid3) {
        this.messagepictureid3 = messagepictureid3;
    }

	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", messagetype=" + messagetype + ", messagetime=" + messagetime
				+ ", messageinfo=" + messageinfo + ", messagereadingtimes=" + messagereadingtimes
				+ ", messagepublisher=" + messagepublisher + ", messagepictureid1=" + messagepictureid1
				+ ", messagepictureid2=" + messagepictureid2 + ", messagepictureid3=" + messagepictureid3 + "]";
	}
}