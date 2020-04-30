package com.example.demo;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Show {

	@Id
	private Integer showId;
	private Time showStartTime;
	private Time showEndTime;
	private String showName;
	private Integer screenId;
	private Integer theaterId;
	
	public Show() {
		
	}

	public Show(Integer showId, Time showStartTime, Time showEndTime, String showName, Integer screenId,
			Integer theaterId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.screenId = screenId;
		this.theaterId = theaterId;
	}

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public Time getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(Time showStartTime) {
		this.showStartTime = showStartTime;
	}

	public Time getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(Time showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	
}
