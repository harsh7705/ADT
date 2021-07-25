package com.adt.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.adt.model.Movie;
import com.adt.service.MovieService;

/**
 * This is controller class for User related requests
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Controller
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

	@GetMapping("/")
	public String index(Model m) {
		List<Movie> moviesList = service.getAllMovies();
		List<Movie> moviesList1 = new ArrayList<Movie>();
		moviesList1.add(moviesList.get(0));
		moviesList1.add(moviesList.get(1));
		moviesList1.add(moviesList.get(2));
		m.addAttribute("moviesList", moviesList1);
		return "index";
	}

	@GetMapping("/movies")
	public String movies(Model m) {
		List<Movie> moviesList = service.getAllMovies();
		m.addAttribute("moviesList", moviesList);
		return "movies";
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

	@PostMapping("movie/{id}")
	public String findMovieByID(@PathVariable String id, Model model) {
		//Movie m = service.findMovie(id);
		//model.addAttribute("movie", m);
		return "movie";
	}
}
