package com.vehicle.common.model.DO;

import java.io.Serializable;

public class Park implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5008372942212730832L;

	private Integer parkid;

	private String name;

	private String address;

	public Integer getParkid() {
		return parkid;
	}

	public void setParkid(Integer parkid) {
		this.parkid = parkid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}