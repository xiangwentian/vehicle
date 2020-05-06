package com.vehicle.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vehicle.VehicleServerApplication;
import com.vehicle.service.ParkingService;

@SpringBootTest(classes = VehicleServerApplication.class)
@RunWith(SpringRunner.class)
public class JunitTest {

	@Resource(name = "parkingService")
	ParkingService parkingService;

	@Test
	public void insert1Test() {
		// ParkingRecord record = new ParkingRecord();
		// record.setPark_id(1);
		// record.setCar_no("冀B851LP");
		// record.setIn_time(new Date());
		// parkingService.parkingIn(record);
	}
}
