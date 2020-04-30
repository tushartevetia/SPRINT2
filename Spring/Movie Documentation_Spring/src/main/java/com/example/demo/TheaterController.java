package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TheaterController {
	
	@Autowired
	private  TheaterService theaterservice;
	
	@RequestMapping("/theater")
	public List<Theater> getAllTheater() {
		return theaterservice.getAllTheater();
				
			}
	@RequestMapping(method=RequestMethod.POST ,value="/theater")
	public void addTheater(@RequestBody Theater theater) {
		theaterservice.addTheater(theater);
		}
	
	@RequestMapping("/theater/{theaterId}")
	public Theater searchMovie(@PathVariable ("theaterId") String theaterId) {
		return theaterservice.searchMovie(theaterId);
		}
	
	
/*@RequestMapping("/theater/{screenId}")
	public long searchScreen(@PathVariable int sid) {
	return theaterservice.searchScreen(sid);
	*/
	}

