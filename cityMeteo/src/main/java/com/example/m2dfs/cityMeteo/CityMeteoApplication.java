package com.example.m2dfs.cityMeteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CityMeteoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityMeteoApplication.class, args);
	}

}
