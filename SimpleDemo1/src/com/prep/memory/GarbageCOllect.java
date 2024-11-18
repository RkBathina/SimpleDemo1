package com.prep.memory;

public class GarbageCOllect {
	
	public void finalize() {
		System.out.println("Finalize method is called");
	}

	public static void main(String[] args) {
		// Unused objects
		// un refenced objects
		//anonymus object
		
		GarbageCOllect gcp1 = new GarbageCOllect();
		GarbageCOllect gcp2 = new GarbageCOllect();
		GarbageCOllect gcp3 = new GarbageCOllect();
		
		new GarbageCOllect();//Anonymous object
		
		gcp1 = null;//unrefenced or unused object
		gcp2=gcp3;
		
		
		System.gc(); // when we are collecting garbage, then if we need to do any other tasks like writing log files, it internally call finalize method
		//Runtime.getRuntime().gc();

	}

}
