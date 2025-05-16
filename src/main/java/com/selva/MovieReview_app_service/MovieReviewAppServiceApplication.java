package com.selva.MovieReview_app_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieReviewAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewAppServiceApplication.class, args);
	}

	@GetMapping("/")
	public String appRoot(){
		return  "Hello, world.";
	}
}
