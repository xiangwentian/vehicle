package com.vehicle.domain.dao;

import java.util.List;

import com.vehicle.common.model.DO.Park;

public interface ParkMapper {
	int deleteByPrimaryKey(Integer parkid);

	int insert(Park record);

	Park selectByPrimaryKey(Integer parkid);

	List<Park> selectAll();

	int updateByPrimaryKey(Park record);
}