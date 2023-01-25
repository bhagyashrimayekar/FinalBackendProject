package com.carloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountHeadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountHeadServiceApplication.class, args);
	}

}
