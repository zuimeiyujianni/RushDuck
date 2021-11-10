package com.rushduck.bean;
import java.util.List;

public class ProcessedMessage {
	//发布该message的用户的基本信息
	private UserBaseMessage ubm;
	//message的信息
	private Message message;
	//message的图片信息
	private List<Picture> pictures;
	//评论该message的信息（放在对应多个位置，当用户点击评论的时候进行显示或者隐藏）
    private List<CommentBaseMessage> cbms;
	//喜欢，点赞该message的用户的基本信息
    private List<UserBaseMessage> likesubms;
	//转发该message的数量
    private Long forwardTimes;
    
	public UserBaseMessage getUbm() {
		return ubm;
	}
	public void setUbm(UserBaseMessage ubm) {
		this.ubm = ubm;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public List<CommentBaseMessage> getCbms() {
		return cbms;
	}
	public void setCbms(List<CommentBaseMessage> cbms) {
		this.cbms = cbms;
	}
	public List<UserBaseMessage> getLikesubms() {
		return likesubms;
	}
	public void setLikesubms(List<UserBaseMessage> likesubms) {
		this.likesubms = likesubms;
	}
	public Long getForwardTimes() {
		return forwardTimes;
	}
	public void setForwardTimes(Long forwardTimes) {
		this.forwardTimes = forwardTimes;
	}
	@Override
	public String toString() {
		return "ProcessedMessage [ubm=" + ubm + ", message=" + message + ", pictures=" + pictures + ", cbms=" + cbms
				+ ", likesubms=" + likesubms + ", ForwardTimes=" + forwardTimes + "]";
	}
}
