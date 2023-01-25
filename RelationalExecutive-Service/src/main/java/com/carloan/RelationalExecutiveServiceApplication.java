package com.carloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.carloan.docsupload.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
@EnableEurekaClient
public class RelationalExecutiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationalExecutiveServiceApplication.class, args);
		System.out.println("Relational Executive Is Running.....");
	}

}
