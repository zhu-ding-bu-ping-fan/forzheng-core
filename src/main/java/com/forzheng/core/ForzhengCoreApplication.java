package com.forzheng.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ForzhengCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForzhengCoreApplication.class, args);
		System.out.println("forzheng-core:启动完成");
	}
}
