package com.cg.OnlineMovieTicketSystem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/*
 * @author-Tushar Tevetia
 */
@Entity
@Table(name="booking")
public class Booking implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "seqgen")
	@SequenceGenerator(name = "seqgen",sequenceName ="boId_seq" )
	private int bookingId;
	private String movieName;
	private String movieLanguage;
	private int numOfSeat;
	
	
/*	@Column(length=12)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
*/	
	public Booking() {
		
	}

	public Booking(String movieName, String movieLanguage, int numOfSeat,
			int transactionId) {
		super();
		//this.bookingId = bookingId;
		this.movieName = movieName;
		this.movieLanguage = movieLanguage;
		this.numOfSeat = numOfSeat;
	
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public int getNumOfSeat() {
		return numOfSeat;
	}

	public void setNumOfSeat(int numOfSeat) {
		this.numOfSeat = numOfSeat;
	}



	
	
	
}
