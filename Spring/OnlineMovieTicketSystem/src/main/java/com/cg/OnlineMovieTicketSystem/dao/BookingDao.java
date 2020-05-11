package com.cg.OnlineMovieTicketSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.OnlineMovieTicketSystem.model.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer>{

}
