package com.selva.MovieReview_app_service.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;


@Document(collection = "movies")
@Data
@AllArgsConstructor // For constructor with all the non-static fields of the class
@NoArgsConstructor  // For constructor without arguments
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private List<String> genres;
    private String poster;
    private String backdrops;
    @DocumentReference // It will keep the Review in the separate collection else the object will be embedded directly inside the parent document
    private List<Review> reviewIds;
}
