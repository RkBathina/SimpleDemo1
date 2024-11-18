package com.prep.polymor;

//Method Overloading
public class Calculations {
	
	public void add(int a, int b) {
		//add method code
	}
	
	public void add(int a, int b, int c ) {
		//addd method
	}
	
	public void add(double a, double b) {
		//add method code
	}
	
	public void add(int a, double b) {
		//add method code
	}
	public void add(double a, int b) {
		//add method code
	}
	public static void main(String[] args) {
		Calculations calculations = new Calculations();
		calculations.add(2.4, 3.9);
		calculations.add(3, 5);
		calculations.add(4, 6);
		calculations.add(1, 2);
		calculations.add(4, 5 , 6);
		
	}
}
