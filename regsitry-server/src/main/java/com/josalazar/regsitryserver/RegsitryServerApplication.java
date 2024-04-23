package com.josalazar.regsitryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegsitryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegsitryServerApplication.class, args);
	}

}
