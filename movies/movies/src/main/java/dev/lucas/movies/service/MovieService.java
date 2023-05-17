package dev.lucas.movies.service;

import dev.lucas.movies.model.Movie;
import dev.lucas.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
     public List<Movie> AllMovies(){
         return movieRepository.findAll();
     }




}
