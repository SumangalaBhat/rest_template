package com.hcl.customer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResttempApplication {

	private static final Logger log = LoggerFactory.getLogger(ResttempApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ResttempApplication.class, args);
		
		RestTemplate restTemplate = new RestTemplate();
		Object student = restTemplate.getForObject("http://localhost:9080/students" ,Object.class);
	
		System.out.println("data : "+student);
	}

}
