package com.rushduck.bean;

import java.util.Date;

public class UserBaseMessage {
	private Integer userid;

    private String username;

    private String password;

    private String salt;

    private String phonenumber;

    private Boolean admin;

    private String sex;

    private String school;

    private String emotion;

    private String bloodtype;

    private String signature;

    private String wechat;

    private String qq;

    private String email;

    private String name;

    private Date birthday;

    private Boolean authenticated;

    private Short level;

    private Short vip;

    private String portraiturl;

    private String musicurl;

	public UserBaseMessage() { }

	public UserBaseMessage(Integer userid, String username, String password, String salt, String phonenumber,
			Boolean admin, String sex, String school, String emotion, String bloodtype, String signature, String wechat,
			String qq, String email, String name, Date birthday, Boolean authenticated, Short level, Short vip,
			String portraiturl, String musicurl) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.phonenumber = phonenumber;
		this.admin = admin;
		this.sex = sex;
		this.school = school;
		this.emotion = emotion;
		this.bloodtype = bloodtype;
		this.signature = signature;
		this.wechat = wechat;
		this.qq = qq;
		this.email = email;
		this.name = name;
		this.birthday = birthday;
		this.authenticated = authenticated;
		this.level = level;
		this.vip = vip;
		this.portraiturl = portraiturl;
		this.musicurl = musicurl;
	}

	public UserBaseMessage(User u) { 
		this.userid = u.getUserid();
		this.username = u.getUsername();
		this.password = u.getPassword();
		this.salt = u.getSalt();
		this.phonenumber = u.getPhonenumber();
		this.admin = u.getAdmin();
		this.sex = u.getSex();
		this.school = u.getSchool();
		this.emotion = u.getEmotion();
		this.bloodtype = u.getBloodtype();
		this.signature = u.getSignature();
		this.wechat = u.getWechat();
		this.qq = u.getQq();
		this.email = u.getEmail();
		this.name = u.getName();
		this.birthday = u.getBirthday();
		this.authenticated = u.getAuthenticated();
		this.level = u.getLevel();
		this.vip = u.getVip();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	public Short getLevel() {
		return level;
	}

	public void setLevel(Short level) {
		this.level = level;
	}

	public Short getVip() {
		return vip;
	}

	public void setVip(Short vip) {
		this.vip = vip;
	}

	public String getPortraiturl() {
		return portraiturl;
	}

	public void setPortraiturl(String portraiturl) {
		this.portraiturl = portraiturl;
	}

	public String getMusicurl() {
		return musicurl;
	}

	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}

	@Override
	public String toString() {
		return "UserBaseMessage [userid=" + userid + ", username=" + username + ", password=" + password + ", salt="
				+ salt + ", phonenumber=" + phonenumber + ", admin=" + admin + ", sex=" + sex + ", school=" + school
				+ ", emotion=" + emotion + ", bloodtype=" + bloodtype + ", signature=" + signature + ", wechat="
				+ wechat + ", qq=" + qq + ", email=" + email + ", name=" + name + ", birthday=" + birthday
				+ ", authenticated=" + authenticated + ", level=" + level + ", vip=" + vip + ", portraiturl="
				+ portraiturl + ", musicurl=" + musicurl + "]";
	}
}
