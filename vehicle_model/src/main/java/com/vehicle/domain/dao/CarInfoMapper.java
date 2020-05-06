package com.vehicle.domain.dao;

import java.util.List;

import com.vehicle.common.model.DO.CarInfo;

public interface CarInfoMapper {
	int deleteByPrimaryKey(String car_id);

	int insert(CarInfo record);

	CarInfo selectByPrimaryKey(String car_id);

	List<CarInfo> selectAll();

	int updateByPrimaryKey(CarInfo record);
}