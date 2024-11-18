package com.prep.functionInterfaces;

@FunctionalInterface
public interface Car { //Functional interface contains only one abstract method
	
	void drive(); //By default it is abstarct method, no need to use abstarct keyword
	
	
	//from java 1.8 we can add default, private, static methods can be added with implimentation
	default void honk() {
		
	}
	
	private void light() {
		
	}
	
	static void breaks() {
		
	}
	
	// java.util.function -- this package contains functional interfaces
}
