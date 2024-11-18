package com.prep.interfaces;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.cut();
		lenovo.paste();
		lenovo.keyboard();
		lenovo.camera();
		lenovo.security();
		Laptop.audio(); //As we used static keyword in interface and we are accessing in static main method we can directly call with interface name
		
		
		
		HP hp = new HP();
		hp.printing();
		hp.security();
		
		
		// until java7 it was like that in interface that is we can only  declare what to do in interafce, but in java 8 how to do also implemented
		
	
		
			
			

	}

}
