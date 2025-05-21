package com.selva.MovieReview_app_service.Repository;

import com.selva.MovieReview_app_service.Model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
