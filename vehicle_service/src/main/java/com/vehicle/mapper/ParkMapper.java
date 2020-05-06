package com.vehicle.mapper;

import com.vehicle.model.entity.Park;
import java.util.List;

public interface ParkMapper {
    int deleteByPrimaryKey(Integer parkid);

    int insert(Park record);

    Park selectByPrimaryKey(Integer parkid);

    List<Park> selectAll();

    int updateByPrimaryKey(Park record);
}