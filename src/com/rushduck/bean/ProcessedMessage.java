package com.rushduck.bean;
import java.util.List;

public class ProcessedMessage {
	//������message���û��Ļ�����Ϣ
	private UserBaseMessage ubm;
	//message����Ϣ
	private Message message;
	//message��ͼƬ��Ϣ
	private List<Picture> pictures;
	//���۸�message����Ϣ�����ڶ�Ӧ���λ�ã����û�������۵�ʱ�������ʾ�������أ�
    private List<CommentBaseMessage> cbms;
	//ϲ�������޸�message���û��Ļ�����Ϣ
    private List<UserBaseMessage> likesubms;
	//ת����message������
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
