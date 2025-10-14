package com.tnsif.Scanner;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name ");
		String name=sc.next();
		
		System.out.println("Enter your Phone Number ");
		long phno=sc.nextLong();
		
		System.out.println("Enter your Gender by typing F or M ");
		char gender=sc.next().charAt(0);
		
		System.out.println("Hello "+name+" calling you through "+phno);
		System.out.println("Gender "+gender);
		
		sc.close();
	}
}