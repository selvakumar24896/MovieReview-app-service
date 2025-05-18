package com.selva.MovieReview_app_service.Service;

import com.selva.MovieReview_app_service.Model.Movie;
import com.selva.MovieReview_app_service.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieByImdbId(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
