package com.rushduck.bean;

public class Forward {
    private Integer forwardid;

    private Integer forwarder;

    private Integer forwardmessageid;

    public Integer getForwardid() {
        return forwardid;
    }

    public void setForwardid(Integer forwardid) {
        this.forwardid = forwardid;
    }

    public Integer getForwarder() {
        return forwarder;
    }

    public void setForwarder(Integer forwarder) {
        this.forwarder = forwarder;
    }

    public Integer getForwardmessageid() {
        return forwardmessageid;
    }

    public void setForwardmessageid(Integer forwardmessageid) {
        this.forwardmessageid = forwardmessageid;
    }

	@Override
	public String toString() {
		return "Forward [forwardid=" + forwardid + ", forwarder=" + forwarder + ", forwardmessageid=" + forwardmessageid
				+ "]";
	}
}