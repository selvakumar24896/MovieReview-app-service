package com.selva.MovieReview_app_service.Repository;

import com.selva.MovieReview_app_service.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    public Optional<Movie> findByImdbId(String imdbId);
}
