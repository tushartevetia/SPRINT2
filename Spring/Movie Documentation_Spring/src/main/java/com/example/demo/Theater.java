package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Theater {

	@Id
	public String theaterId;
	public String theatername;
	public String theaterCityString;
	public String managerName;
	public String managerContact;
	@OneToMany
	private Movie movie;
	
	
	public Theater() {
		
	}
	

	public Theater(String theaterId, String theatername, String theaterCityString, String managerName,
			String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theatername = theatername;
		this.theaterCityString = theaterCityString;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}


	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheatername() {
		return theatername;
	}

	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}

	public String getTheaterCityString() {
		return theaterCityString;
	}

	public void setTheaterCityString(String theaterCityString) {
		this.theaterCityString = theaterCityString;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
}
