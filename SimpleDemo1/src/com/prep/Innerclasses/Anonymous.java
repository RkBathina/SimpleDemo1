package com.prep.Innerclasses;

public class Anonymous {

	private int id =101;
	public static void main(String[] args) {
		int salary =6000;
		
//		class2 c2 = new class2();
//		c2.print();
//		c2.show();
		class1 c1 = new class1() { //Anonymous class declaration syntax
			public void print() {
				System.out.println("Updated Print method is called by anonymus class"); 
			}
		};
		c1.print();
		c1.show();
	}

}

class class1{
	public void show() {
		System.out.println("Show method is called");
	}
	
	public void print() {
		System.out.println("Print method is called");
	}
}

class class2 extends class1{ //we are creating new class just add piece of code for print(), its isnot necesaary instead we can use anpnymous claass for this particular print method
	public void print() {
		System.out.println("Updated Print method is called"); 
	}
}