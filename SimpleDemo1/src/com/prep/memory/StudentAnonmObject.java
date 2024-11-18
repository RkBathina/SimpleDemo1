package com.prep.memory;

public class StudentAnonmObject {
	
	String name = "Kittu";
	
	public void greet() {
		System.out.println("Hi" + name);
	}
	
	public void attend() {
		System.out.println("Attend");
	}
	public static void main(String[] args) {
		int i; // i is referenced variable
		i =10;//definition
		StudentAnonmObject s1; //here s1 is referenced variable
		s1 = new StudentAnonmObject(); //only "new" keyword + Constructor is object which is on right hand side, s1 is referenced variable
		//Reference variable
		//Referenced object
		s1.greet();
		s1.attend();
		
		new StudentAnonmObject();// Anonymus object because we rae not refernceing with any variable
		new StudentAnonmObject().greet();// we can call this method (only one method can be called 
		s1=null;// unreferenced object 
		
		//Note: if we ahve single method we can use anonymus object as above, if we have more than one opertaions we can use refernced variable
		
	}

}
