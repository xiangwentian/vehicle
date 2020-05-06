package com.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

// @EnableApolloConfig
@EnableEurekaServer
@SpringBootApplication
// @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class }) //
// 排除DataSourceConfiguratrion
//@EnableAutoConfiguration(exclude = { HikariDataSource.class })
@EnableTransactionManagement(proxyTargetClass = true) // 开启事物管理功能
public class VehicleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleServerApplication.class, args);
	}

}
