package com.example.myfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {SecurityException.class})
public class MyFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFinderApplication.class, args);
	}

}
