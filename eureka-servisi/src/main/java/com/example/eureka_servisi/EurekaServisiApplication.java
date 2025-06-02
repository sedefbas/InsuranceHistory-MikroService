package com.example.eureka_servisi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServisiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServisiApplication.class, args);
	}

}
