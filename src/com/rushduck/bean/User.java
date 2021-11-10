package com.rushduck.bean;

import java.util.Date;

public class User {
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

    private Integer portraitid;

    private Integer musicid;

    public User() {}
    
    

	public User(Integer userid, String username, String password, String salt, String phonenumber, Boolean admin,
			String sex, String school, String emotion, String bloodtype, String signature, String wechat, String qq,
			String email, String name, Date birthday, Boolean authenticated, Short level, Short vip, Integer portraitid,
			Integer musicid) {
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
		this.portraitid = portraitid;
		this.musicid = musicid;
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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
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
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion == null ? null : emotion.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getPortraitid() {
        return portraitid;
    }

    public void setPortraitid(Integer portraitid) {
        this.portraitid = portraitid;
    }

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", salt=" + salt
				+ ", phonenumber=" + phonenumber + ", admin=" + admin + ", sex=" + sex + ", school=" + school
				+ ", emotion=" + emotion + ", bloodtype=" + bloodtype + ", signature=" + signature + ", wechat="
				+ wechat + ", qq=" + qq + ", email=" + email + ", name=" + name + ", birthday=" + birthday
				+ ", authenticated=" + authenticated + ", level=" + level + ", vip=" + vip + ", portraitid="
				+ portraitid + ", musicid=" + musicid + "]";
	}
}