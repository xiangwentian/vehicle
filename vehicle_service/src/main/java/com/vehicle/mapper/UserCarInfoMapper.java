package com.vehicle.mapper;

import com.vehicle.model.entity.UserCarInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCarInfoMapper {
    int deleteByPrimaryKey(@Param("uid") String uid, @Param("car_id") String car_id, @Param("state") Integer state);

    int insert(UserCarInfo record);

    List<UserCarInfo> selectAll();
}