package com.vehicle.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.model.entity.ParkingRecord;
import com.vehicle.service.ParkingService;
import com.vehicle.utils.Result;

//@Controller
@RestController
public class VehicleController {

	// @Autowired默认按类型装配（这个注解是属业spring的）
	// @Resource 是JDK1.6支持的注解，默认按照名称进行装配
	// @Autowired
	@Resource(name = "parkingService")
	ParkingService parkingService;

	@RequestMapping("/hi")
	//@ResponseBody
	public String home(@RequestParam String name) {
		return parkingService.hiService(name);
	}

	// @RequestMapping("/getname")
	// @ResponseBody
	// public UserInfoVo getUserNameById(@RequestParam String uid) {
	//
	// UserInfo userInfo = parkingService.getUserNameByUid(uid);
	//
	// UserInfoVo userInfoVo = new UserInfoVo();
	// BeanUtils.copyProperties(userInfo, userInfoVo);
	// return userInfoVo;
	// // return userInfo!=null?userInfo.getUser_name():"null";
	// }

	// @RequestMapping("/in")
	// @ResponseBody
	// public Result parkingIn(@RequestParam ParkingRecord record) {
	// return parkingService.parkingIn(record);
	// }
	//
	@RequestMapping("/in2")
	//@ResponseBody
	public Result parkingIn2(@RequestParam(value = "carNo") String car_no,
			@RequestParam(value = "parkId") int park_id) {
		ParkingRecord record = new ParkingRecord();
		record.setPark_id(park_id);
		record.setCar_no(car_no);
		record.setIn_time(new Date());
		record.setOut_time(new Date());
		return parkingService.parkingIn(record);
	}
}
