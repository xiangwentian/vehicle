package com.vehicle.mapper;

import com.vehicle.model.entity.ParkingRecord;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRecordMapper {
    int insert(ParkingRecord record);

    List<ParkingRecord> selectAll();
}