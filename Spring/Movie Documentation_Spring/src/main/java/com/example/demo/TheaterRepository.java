package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TheaterRepository extends JpaRepository<Theater, String> {

	public List<Movie> findByMovieName(String movieName);
	
}
