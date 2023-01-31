package com.example.mydashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer

public class MyDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDashboardApplication.class, args);
	}

}
