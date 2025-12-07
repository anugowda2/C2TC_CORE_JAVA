package com.tnsif.MLInheritance;

public class State extends Country {
	
	private String state;
	private String language;
	
	public State(String countryName, String aadharNo, String state, String language) {
		super(countryName, aadharNo);
	}
	
	//Go to Source Generate Getters and Setters Select all
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}	
}