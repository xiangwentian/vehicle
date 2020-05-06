package com.vehicle.common.model.DO;

import java.io.Serializable;

public class UserCarInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5173420000311022090L;

	private String uid;

	private String car_id;

	private Integer state;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}