 package com.prep.inhert;

public class Admin extends Developer {
	
	
	// Add / Delete the product/applic
	public void manage() {
		super.read();
		write();
		System.out.println("Manage Code");
	}
	
	public void read() {
		System.out.println("Read inside Admin");
	}

}
