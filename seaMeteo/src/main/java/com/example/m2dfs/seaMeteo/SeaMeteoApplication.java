package com.example.m2dfs.seaMeteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SeaMeteoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeaMeteoApplication.class, args);
	}

}
