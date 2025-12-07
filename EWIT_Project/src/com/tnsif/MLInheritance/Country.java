package com.tnsif.MLInheritance;

public class Country {

	private String countryName;
	private String aadharNo;
	
	//Go to Source Generate Constructor using fields leave default selected
	public Country(String countryName, String aadharNo) {
		super();
		this.countryName = countryName;
		this.aadharNo = aadharNo;
	}
	
	//Go to Source Generate Getters and Setters Select all
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	//Go to Source Generate toString() leave default selected
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", aadharNo=" + aadharNo + "]";
	}
}