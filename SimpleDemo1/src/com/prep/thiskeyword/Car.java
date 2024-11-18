package com.prep.thiskeyword;

import java.util.Arrays;

public interface Car {
	String carname = "jaguar"; //instance variabls
	void drive(); //abstract method
	
	default void headLight() {
		System.out.println(Arrays.toString(this.getClass().getDeclaredMethods())); //As this keyword used 
	}
}

//when a method is returning array, we can use Arrays.tostring to print the array
//In interfaces we cannot use this keyword for accessing instance variables, instead we will use this keyword to get the details of class(methods) which is implementing this interface