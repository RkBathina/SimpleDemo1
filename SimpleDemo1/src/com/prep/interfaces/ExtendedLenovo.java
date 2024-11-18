package com.prep.interfaces;

//method overriding
public class ExtendedLenovo extends Lenovo1{
//	
//	public void copy() {
//		System.out.println("Copy code for extended lenovo");
//	}
//	
	// Annotatation over ride - it is helpful when we are overriding method from parent class, ex in parent class copy() method don't have param but if we give param in our extededlenove class
	//it doesont give any error, if we provide @Override annota it gives error
	
	@Override
	public void copy() {
		System.out.println("Copy code for extended lenovo");
		
	}

}
