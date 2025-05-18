package com.selva.MovieReview_app_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com/selva/MovieReview_app_service/Controller",
		"com/selva/MovieReview_app_service/Service",
		"com/selva/MovieReview_app_service/Repository",
		"com/selva/MovieReview_app_service/Model"})
public class MovieReviewAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewAppServiceApplication.class, args);
	}

}
