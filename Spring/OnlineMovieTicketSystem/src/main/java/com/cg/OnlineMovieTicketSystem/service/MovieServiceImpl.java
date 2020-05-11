package com.cg.OnlineMovieTicketSystem.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.OnlineMovieTicketSystem.dao.MovieDao;
import com.cg.OnlineMovieTicketSystem.model.Movie;
import com.cg.OnlineMovieTicketSystem.model.Theater;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieDao dao ;
	
	@Override
	public String deleteMovie(int id) {
		Optional<Movie> movie = dao.findById(id) ;
		if(!movie.isPresent() || movie == null) {
			return "No movie found for given id!" ;
		}
		dao.deleteById(id);
		return "Movie Deleted Successfully!";
	}

	@Override
	public List<Movie> searchMovie(String movieName) {
		return dao.findByMovieName(movieName) ;
	}

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movies=new ArrayList<>();
		dao.findAll().forEach(movies::add);
		return movies;
	}



}