package com.example.m2dfs.montMeteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MontMeteoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontMeteoApplication.class, args);
	}

}
