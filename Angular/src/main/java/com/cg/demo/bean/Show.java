package com.cg.demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Show {
	@Id
	private int showId;
	@Temporal(TemporalType.TIME)
	private Date showStartTime;
	@Temporal(TemporalType.TIME)
	 private Date showEndtime;
	   private String showName;
	   private int screenId;
	   private int theaterid;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Date getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Date getShowEndtime() {
		return showEndtime;
	}
	public void setShowEndtime(Date showEndtime) {
		this.showEndtime = showEndtime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheaterid() {
		return theaterid;
	}
	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
	}
}
