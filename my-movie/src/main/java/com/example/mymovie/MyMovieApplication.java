package com.example.mymovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer

public class MyMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyMovieApplication.class, args);
    }

}
