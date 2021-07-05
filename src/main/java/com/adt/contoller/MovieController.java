package com.adt.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adt.model.Movie;
import com.adt.service.MovieService;

/**
 * This is controller class for User related requests
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@RestController
public class MovieController {

	@Autowired
	MovieService service;

	/**
	 * API that returns all the movies
	 * 
	 * @return
	 */
	@GetMapping("/movie/all")
	public List<Movie> getAllMovies() {
		return service.getAllMovies();
	}

	/**
	 * API creates a new movie
	 * 
	 * @param movie
	 * @return
	 */
	@PostMapping("/movie/create")
	public Movie createMovie(@RequestBody Movie movie) {
		return service.createMovie(movie);
	}

	/**
	 * API finds a specific movie by its ID
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping("movie/one/{id}")
	public Movie findMovie(@PathVariable String id) {
		return service.findMovie(id);
	}

	/**
	 * API used to update a saved movie
	 * 
	 * @param movie
	 * @return
	 */
	@PostMapping("movie/update")
	public Movie updateMovie(@RequestBody Movie movie) {
		return service.updateMovie(movie);
	}

	/**
	 * API used to delete a movie
	 * 
	 * @param movie
	 * @return
	 */
	@PostMapping("movie/delete/{id}")
	public ResponseEntity deleteMovie(@PathVariable String id) {
		service.deleteMovie(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
