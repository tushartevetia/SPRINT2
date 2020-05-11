package com.cg.OnlineMovieTicketSystem.service;

import com.cg.OnlineMovieTicketSystem.model.Booking;

public interface BookingService {

	public Booking addBooking (Booking booking);
	
	public String cancelBooking(int bookingId);
}
