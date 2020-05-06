package com.vehicle.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vehicle.mapper.ParkingRecordMapper;
import com.vehicle.model.entity.ParkingRecord;
import com.vehicle.service.ParkingService;
import com.vehicle.utils.Result;

@Service("parkingService")
public class ParkingServiceImpl implements ParkingService {

	@Value("${server.port}")
	String port;

	// @Resource
	// private UserInfoMapper userInfoMapper;
	
	@Resource
	private ParkingRecordMapper recordMapper;

	@Override
	public String hiService(String name) {
		return "hi，" + name + ",I am form port：" + port;
	}

	// @Override
	// public UserInfo getUserNameByUid(String uid) {
	// return userInfoMapper.selectByPrimaryKey(uid);
	// }

	@Override
	public Result parkingIn(ParkingRecord record) {
		// TODO Auto-generated method stub
		int state = recordMapper.insert(record);
		System.out.println("state" + state);
		return state > 0 ? Result.ok() : Result.error();
	}

}
