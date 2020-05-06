package com.vehicle.domain.dao;

import java.util.List;

import com.vehicle.common.model.DO.UserInfo;

public interface UserInfoMapper {
	int deleteByPrimaryKey(String uid);

	int insert(UserInfo record);

	UserInfo selectByPrimaryKey(String uid);

	List<UserInfo> selectAll();

	int updateByPrimaryKey(UserInfo record);
}