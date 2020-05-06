package com.vehicle.common.model.DTO;

import java.io.Serializable;
import java.util.Date;

public class ParkingRecordDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 203820155806098582L;

	private Integer park_id;

	private String car_no;

	private Date in_time;

	private Date out_time;

	public Integer getPark_id() {
		return park_id;
	}

	public void setPark_id(Integer park_id) {
		this.park_id = park_id;
	}

	public String getCar_no() {
		return car_no;
	}

	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}

	public Date getIn_time() {
		return in_time;
	}

	public void setIn_time(Date in_time) {
		this.in_time = in_time;
	}

	public Date getOut_time() {
		return out_time;
	}

	public void setOut_time(Date out_time) {
		this.out_time = out_time;
	}
}
