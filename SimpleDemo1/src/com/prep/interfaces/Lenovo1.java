package com.prep.interfaces;

public  class Lenovo1 extends SampleAbstraClas{

	

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo Cut code");
		
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo keyboard code");
		
	}
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println(" copy code updated for lenovo");
		
	}
	
	//Method overriding here we are extending abstarct class which has copy and paste code, but in lenovo class we can again create a new method with same name and same param and write our implemnet.
	public static void main(String[] args) {
		Lenovo1 lenovo1 = new Lenovo1();
		lenovo1.copy(); //this points to void copy () method in this class not to the void copy() method in abstarct class
	}


}

