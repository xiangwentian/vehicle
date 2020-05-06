package com.vehicle.common.model.VO;

import java.io.Serializable;

public class UserInfoVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 617514056271754335L;

	private String uid;

	private String user_name;

	private String phone;

	private String mail;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
