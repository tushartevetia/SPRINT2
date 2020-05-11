package com.cg.OnlineMovieTicketSystem.service;

import java.util.List;

import com.cg.OnlineMovieTicketSystem.model.Movie;

public interface MovieService {
	
	public String deleteMovie(int id) ;
	public List<Movie> searchMovie(String movieName);
	public List<Movie> getAllMovies();

}