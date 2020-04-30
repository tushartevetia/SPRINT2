package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
	@Autowired
	private ShowRepository showRepository;
	
	public List<Show> getAllShows()
	{
	
		List<Show> shows=new ArrayList<>();
		showRepository.findAll().forEach(shows::add);
		return shows;
		}
}
