package com.f1.api.f1resuts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class F1ResultsApplication {

	public static void main(String[] args) {
		SpringApplication.run(F1ResultsApplication.class, args);
	}

}
