package com.tnsif.staticdemo;

public class Employee {
	
	//Declare instance variable
	private String name;
	private int id;
	
	//Declare a static variable companyName with data type String 
	//TNS which is common for all the objects
	static String companyName = "TNS";
	
	//Go to Source Generate Getters and Setters Select name and id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Declare a two-parameter constructor with parameters name and id
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}

	//Go to Source Generate toString() leave default selected
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company="+companyName+"]";
	}	
}