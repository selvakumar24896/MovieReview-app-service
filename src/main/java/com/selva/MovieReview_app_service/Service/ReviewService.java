package com.selva.MovieReview_app_service.Service;

import com.selva.MovieReview_app_service.Model.Movie;
import com.selva.MovieReview_app_service.Model.Review;
import com.selva.MovieReview_app_service.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate; // To interact with MongoDB using a lower-level, flexible API compared to the higher-level MongoRepository

    public Review createReview(String body, String imdbId) {
        Review review = reviewRepository.insert(new Review(body));     // Add review to Reviews Collection

        mongoTemplate.update(Movie.class)       // Specifies the collection/entity class you're updating
                .matching(Criteria.where("imdbId").is(imdbId))  // Creates a query condition
                .apply(new Update().push("reviewIds").value(review)) // add the value of review to the reviewIds array field in the matched document.
                .first();   // Applies the update to the first matching document only

        return  review;
    }
}
