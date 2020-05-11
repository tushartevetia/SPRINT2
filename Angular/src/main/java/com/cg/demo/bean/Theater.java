package com.cg.demo.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Theater {
	@Id
	private int theaterId;
	private String theaterName;
	private String managerName;
	private String managerContact;
	@OneToMany(mappedBy = "theater", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Movie> movies;

	Theater() {

	}

	public Theater(String theaterName, String managerName, String managerContact) {
		super();

		this.theaterName = theaterName;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
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
