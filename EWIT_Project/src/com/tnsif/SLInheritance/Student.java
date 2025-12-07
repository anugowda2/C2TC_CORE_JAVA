package com.tnsif.SLInheritance;

public class Student extends Citizen {
	private int rollNo;
	private String collegeName;
	
	//Go to Source Generate Constructor using source
	public Student() {
		super();
	}
	
	public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
		super(name, aadharNo, address, phno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	//Go to Source Generate Getters and Setters Select all
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	//Go to Source Generate toString() leave default slected and select inherit method
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}