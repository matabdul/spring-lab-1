package com.prometheus_labs.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Prometheus {

	@GetMapping("/home")
	String hello(){
		return "Welcome to home page!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Prometheus.class, args);
	}

}
