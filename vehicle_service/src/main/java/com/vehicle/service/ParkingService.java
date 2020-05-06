package com.vehicle.service;

import com.vehicle.model.entity.ParkingRecord;
import com.vehicle.utils.Result;

public interface ParkingService {
	public String hiService(String name);

//	public UserInfo getUserNameByUid(String uid);

	public Result parkingIn(ParkingRecord record);
}
