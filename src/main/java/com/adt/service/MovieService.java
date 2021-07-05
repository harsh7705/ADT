package com.adt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adt.model.Movie;
import com.adt.repository.MovieRepository;

/**
 * Service layer for movie related requests
 * 
 * @author Harsh Vyas <vyas61@uwindsor.ca>
 *
 */
@Service
@Transactional
public class MovieService {

	@Autowired
	MovieRepository repository;

	public List<Movie> getAllMovies() {
		return repository.findAll();
	}

	public Movie createMovie(Movie movie) {
		return repository.insert(movie);
	}

	public Movie findMovie(String id) {
		return repository.findById(id).get();
	}

	public Movie updateMovie(Movie movie) {
		return repository.save(movie);
	}

	public void deleteMovie(String id) {
		repository.deleteById(id);
	}
}
