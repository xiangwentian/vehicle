package com.vehicle.web.service;

import com.vehicle.common.model.VO.UserInfoVo;

public interface ParkingService {
	public String hiService(String name);
	
	public UserInfoVo getUserNameById(String uid);
}
