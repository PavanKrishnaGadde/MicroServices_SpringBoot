package com.pk.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
         	
        Movie movie1 = new Movie("100","Bahubali - The Beginning" ,"PART 1 OF BAHUBALI MOVIE" );
        Movie movie2 = new Movie("200","Title of movie" ,"PART 2 OF BAHUBALI MOVIE" );
        
        if (movieId.equalsIgnoreCase(movie1.getMovieId())) return movie1;
        if (movieId.equalsIgnoreCase(movie2.getMovieId())) return movie2;
        
        return new Movie(movieId, "Movie info not available", "");
    }

}
