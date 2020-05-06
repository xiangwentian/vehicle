package com.vehicle.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vehicle.common.model.VO.UserInfoVo;
import com.vehicle.web.service.ParkingService;

@Controller
public class IndexController {

	@Resource(name = "parkingService")
	ParkingService parkingService;

	@GetMapping("/hi")
	@ResponseBody
	public String hi(@RequestParam String name) {
		return parkingService.hiService(name);
	}

	@GetMapping("/getname")
	@ResponseBody
	public UserInfoVo getUserNameById(@RequestParam String uid) {
		return parkingService.getUserNameById(uid);
	}
}
