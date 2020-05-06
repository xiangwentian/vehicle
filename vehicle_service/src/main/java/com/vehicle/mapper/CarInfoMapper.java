package com.vehicle.mapper;

import com.vehicle.model.entity.CarInfo;
import java.util.List;

public interface CarInfoMapper {
    int deleteByPrimaryKey(String car_id);

    int insert(CarInfo record);

    CarInfo selectByPrimaryKey(String car_id);

    List<CarInfo> selectAll();

    int updateByPrimaryKey(CarInfo record);
}