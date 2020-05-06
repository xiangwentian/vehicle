package com.vehicle.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vehicle.common.model.VO.UserInfoVo;
import com.vehicle.web.service.ParkingService;

@Service(value = "parkingService")
public class ParkingServiceImp implements ParkingService {

	@Autowired
	RestTemplate restTemplate;

	public String hiError(String name) {
		return "hey" + name + ",there is some problem with hi page";
	}

	@HystrixCommand(fallbackMethod = "hiError")
	@Override
	public String hiService(String name) {
		return restTemplate.getForObject("http://VEHICLE-SERVER/hi?name=" + name, String.class);
	}

	@Override
	public UserInfoVo getUserNameById(String uid) {
		return restTemplate.getForObject("http://VEHICLE-SERVER/getname?uid=" + uid, UserInfoVo.class);
	}

}
