package com.lara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesPaymentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesPaymentserviceApplication.class, args);
	}

}
