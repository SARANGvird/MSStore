package com.Solution.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserServices1Application.class, args);
	}

}
