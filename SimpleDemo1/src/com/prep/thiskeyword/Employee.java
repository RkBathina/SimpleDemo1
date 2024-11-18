package com.prep.thiskeyword;

public class Employee {
	
	int age =25; //instance variables - Are the variables which are non static in the class level. (These are called insatnce variables because we are able to only access them by creating instance to class outside the class/)
	
	public Employee() {
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setAge(10);
		//e.setAge(20, e);//not good practise 
		System.out.println(e.getAge());
		
		Employee e1 = new Employee();
		e1.setAge(20);
		System.out.println(e1.getAge());
		
		Employee e2 = new Employee();
		e2.setAge(30);
		System.out.println(e2.getAge());
		
		//if we use this keyword, we will get the instance of object that is being used there(it is just using the existing object it doesnot craete new object)
		// this keyword used in non-static methods/blocks, constructors, abstract classes, Interfaces (but not in static methods).
	}
	
	public int getAge() {
		//int age = 60;
		//this.age = age; //In java this keyword is used to access instance variables if we use this keyword we can manipulate instance variables data
		return age; //returns 60
		//return this.age; returns 25
	}
	
	public void setAge(int age) {
		//age =age; //if given like this age takes value from the method, if age is not there in method it takes from parameters, it doesnot take from class level
		this.age =age;
		//new Employee().age = age;
	}
	
	public void setAge(int age, Employee e) {//every time we need to pass employee obj so that it helps us to get access of instance varibale, but if we have n num of varibales we need to create obj every time which is not good instead "this" keyword itself is an object which give access to instance variables
		e.age = age;
	}
	
	{
		System.out.println(this.age); //non static block
	}

}
