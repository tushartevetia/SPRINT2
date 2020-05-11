package com.cg.OnlineMovieTicketSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.OnlineMovieTicketSystem.model.Movie;
import com.cg.OnlineMovieTicketSystem.model.Theater;
import com.cg.OnlineMovieTicketSystem.service.MovieService;
import com.cg.OnlineMovieTicketSystem.service.TheaterService;

/*
 * @author-Tushar Tevetia
 */
@RestController
@RequestMapping("/lookintoTheater")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TheaterController {

	@Autowired
	private MovieService movieService ;
	
	@Autowired
	private TheaterService theaterService;
	
	//------------------------------------------------Show Particular Movie------------------------------------------------------------
	
	@GetMapping("/showMovie/{theaterId}/{movieName}")
	public List<Movie> findMovieByTheaterId(@PathVariable("theaterId")int tid,@PathVariable("movieName")String movieName)
	{
		Theater theater = theaterService.findTheaterById(tid) ;
		if(theater.getTheaterId()==tid)
		{
		return movieService.searchMovie(movieName);
	}
		else
			return null;
	
	}
	//-------------------------------------------------Show Particular Theater--------------------------------------------------
	
	@GetMapping("/showTheater/{theaterId}")
	public Theater findTheaterByTheaterId(@PathVariable("theaterId")int tid)
	{
		Theater theater = theaterService.findTheaterById(tid) ;
		if(theater.getTheaterId()==tid)
		{
		return theaterService.findTheaterById(tid);
	}
		else
			return null;
	
	}
		
	
	
	//-------------------------------------------------Show All Theaters---------------------------------------------------
	
	@GetMapping("/showAllTheater")
	public List<Theater> getAllTheaters(){
		return theaterService.getAllTheaters();
	}
	
	//-------------------------------------------------Show All Movies------------------------------------------------------
	
	@GetMapping("/showAllMovies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
}
   