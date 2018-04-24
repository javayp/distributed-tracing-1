package com.microservice.backend.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendServApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendServApplication.class, args);
	}
	
	@RequestMapping("/message")
	public String message() {
		return new String("New Message Arrived!");
	}
}
