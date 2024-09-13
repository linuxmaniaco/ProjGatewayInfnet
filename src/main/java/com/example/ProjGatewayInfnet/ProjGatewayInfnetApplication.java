package com.example.ProjGatewayInfnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjGatewayInfnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjGatewayInfnetApplication.class, args);
	}

}
