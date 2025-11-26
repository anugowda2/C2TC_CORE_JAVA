package com.tnsif.generics;

import java.util.List;

public class LowerBoundedWildCard {
	// any super class of Integer class
	public static void displayNumbers(List<? super Integer> list) {
		for (Object n : list) {
			System.out.println(n);
		}
	}
}