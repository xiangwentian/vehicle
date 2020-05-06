package com.vehicle.common.model.DO;

import java.io.Serializable;

public class CarInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3929576328933385659L;

	private String car_id;

	private String car_no;

	private Integer color;

	private String card_no;

	public String getCar_id() {
		return car_id;
	}

	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}

	public String getCar_no() {
		return car_no;
	}

	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
}