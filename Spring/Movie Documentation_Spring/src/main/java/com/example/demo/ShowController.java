package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

	@Autowired
	private ShowService showservice;
	
	@RequestMapping("/shows")
	public List<Show> getAllShows(){
		return showservice.getAllShows();
	}
}

