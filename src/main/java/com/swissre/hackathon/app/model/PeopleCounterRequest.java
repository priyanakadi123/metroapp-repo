package com.swissre.hackathon.app.model;

public class PeopleCounterRequest {

    private String metro;
    private String coachName;
    private int peoplePresent;
    
	public String getMetro() {
		return metro;
	}
	public void setMetro(String metro) {
		this.metro = metro;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public int getPeoplePresent() {
		return peoplePresent;
	}
	public void setPeoplePresent(int peoplePresent) {
		this.peoplePresent = peoplePresent;
	}

   

}
