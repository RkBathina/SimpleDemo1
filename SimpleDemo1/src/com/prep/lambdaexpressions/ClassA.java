package com.prep.lambdaexpressions;

public class ClassA {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		a.drive(50, "Audi");
		Car c = new Car() { //Anpnymous class way of implementing interface
			
			@Override
			public void drive(int s, String m) {
				System.out.println("Driving "+m);
				
			}
		};
		c.drive(78, "BMW");
		
		//Lambda expression with anonymous function with double  parameter
		   Car c1 = (s, m) -> {
			   
			   System.out.println("Driving"+m); 
			   System.out.println("Car is driving very smoothly at speed:" + s);//As the interface is functional it contains only one abstract method, so () this brackets when given java internally serach for that method in the interface
			   
			   if(s>=100)
				   System.out.println("Rash");
			   else
				   System.out.println("Smooth");
		   };
			c1.drive(56, "Ford");
		}
		
		//Lambda expression with anonymous function with single parameter
	   /* Car c1 = (s) -> {
		   
		   System.out.println("Driving FORD"); 
		   System.out.println("Car is driving very smoothly at speed:" + s);//As the interface is functional it contains only one abstract method, so () this brackets when given java internally serach for that method in the interface
		   
		   if(s>=100)
			   System.out.println("Rash");
		   else
			   System.out.println("Smooth");
	   };
		c1.drive(56);
	}*/
	
	//Lambda expression with anonymous function without parameter
	 /*  Car c1 = () -> {
		   int s=100;
		   System.out.println("Driving FORD"); 
		   System.out.println("Car is driving very smoothly at speed:" + s);//As the interface is functional it contains only one abstract method, so () this brackets when given java internally serach for that method in the interface
		   
		   if(s>=100)
			   System.out.println("Rash");
		   else
			   System.out.println("Smooth");
	   };
		c1.drive();
	}*/

}

class Audi implements Car{ //traditional way of implementing interface

	@Override
	public void drive(int s, String m) {
		System.out.println("Driving "+m);
		
	}
	
}




@FunctionalInterface 
interface Car{  //Functional Interface
	public void drive(int speed, String model);
}