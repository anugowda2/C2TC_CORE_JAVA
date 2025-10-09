package com.tnsif.MLInheritance;

public class City extends State {
	
	private String name;
	private String locality;
	
	//Go to Source Generate Constructor using fields leave default selected
	public City(String countryName, String aadharNo, String state, String language, String name, String locality) {
		super(countryName, aadharNo, state, language);
	}
	
	//Go to Source Generate Getters and Setters Select all
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}	
}