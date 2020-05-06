package com.vehicle.domain.dao;

import java.util.List;

import com.vehicle.common.model.DO.UserCarInfo;

public interface UserCarInfoMapper {
	int deleteByPrimaryKey(String uid, String car_id, Integer state);

	int insert(UserCarInfo record);

	List<UserCarInfo> selectAll();
}