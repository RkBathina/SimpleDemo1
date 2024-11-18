package com.prep.lambdaexpressions;

public class ClassB {

	public static void main(String[] args) {
		Audi1 a = new Audi1();
		System.out.println(a.getSpeed());
		
		Car1 c = new Car1() {
			
			@Override
			public int getSpeed() {
				System.out.println("Driving BMW");
				return 60;
			}
		};
		System.out.println(c.getSpeed());
		
		//Lamda expression 
       Car1 c1 = () -> {
    	   int speed =90;
				System.out.println("Driving Ford");
				System.out.println("Car is driving very smoothly at speed:"+speed);
				if(speed >100)
					System.out.println("Rash");
				else
					System.out.println("smooth");
				return speed;
		};
		System.out.println(c1.getSpeed());
		
		//Lamda expression if have only one return value
		// 3components in lambda expressoion:  ()arugemts list, -> arrow token, {}function body
	       Car1 c2 = () -> 100;
	       System.out.println(c2.getSpeed());
	       
	       Car1 c3 = () -> {
	    	   System.out.println("Driving tesla");
	    	   return 120;
	       };
	       System.out.println(c3.getSpeed());

	}
}
	
	class Audi1 implements Car1{

		@Override
		public int getSpeed() {
			// TODO Auto-generated method stub
			System.out.println("Driving audi");
			return 50;
		}
		
	}
	
	@FunctionalInterface
	interface Car1{ //this is returning value
		public int getSpeed();
	}


