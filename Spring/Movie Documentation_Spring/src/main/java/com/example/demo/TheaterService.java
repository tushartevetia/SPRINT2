package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {
	
	@Autowired
	private TheaterRepository theaterRepository;
	
	public List<Theater>theaters=new ArrayList<>(Arrays.asList(
			new Theater("T1","Cineplex","Delhi","Rahul","9899898")));
	
	public List<Theater> getAllTheater() {
	List<Theater> theaters=new ArrayList<>();
		//theaterRepository.findByMovieName(movieName).forEach(theaters::add);
		return theaters;

	}

	public Theater searchMovie(String theaterId) {
		return theaters.stream().filter(t -> t.getTheaterId().equals(theaterId)).findFirst().get();
		//return theaterRepository.findOne(theaterId);
		}
	
	/*public long searchScreen(Integer sid) {
		//return topic.stream().filter(t -> t.getId().equals(sid)).findFirst().get();
		return theaterRepository.count();

}*/

	public void addTheater(Theater theater) {
		theaterRepository.save(theater);
		
	}

	

}
