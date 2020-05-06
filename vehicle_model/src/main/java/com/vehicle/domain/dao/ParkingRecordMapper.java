package com.vehicle.domain.dao;

import java.util.List;

import com.vehicle.common.model.DO.ParkingRecord;

public interface ParkingRecordMapper {
	int insert(ParkingRecord record);

	List<ParkingRecord> selectAll();
}