package com.selva.MovieReview_app_service.Controller;


import com.selva.MovieReview_app_service.Model.Review;
import com.selva.MovieReview_app_service.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> review){
        return  new ResponseEntity<Review>(reviewService.createReview(review.get("reviewBody"), review.get("imdbId")), HttpStatus.CREATED);
    }
}
