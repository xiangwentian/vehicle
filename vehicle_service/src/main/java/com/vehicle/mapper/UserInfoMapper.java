package com.vehicle.mapper;

import com.vehicle.model.entity.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String uid);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(String uid);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
}