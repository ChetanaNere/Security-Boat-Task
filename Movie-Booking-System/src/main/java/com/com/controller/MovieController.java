package com.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.model.Movie;
import com.com.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @GetMapping("/getAllMovies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }
}