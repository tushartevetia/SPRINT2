package com.cg.OnlineMovieTicketSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.OnlineMovieTicketSystem.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer>{
    
	
}