package com.prep.functionInterfaces;

public class UserAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c = new Car1() { //functional interfaces is called
			
			@Override
			public void drive() {
				System.out.println(" Audi Drive is called");
				
				
			}
		};
		c.drive();
	}

}
