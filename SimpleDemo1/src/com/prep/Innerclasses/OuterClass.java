package com.prep.Innerclasses;

//Local classes
public class OuterClass {
	private int id=100; //class level variables can be accessed by inner methods and outside the class too.
	public static void main(String[] args) {
		int salary =5000; //local variable (which is defined inside block of code where it can have scope for that particular block)
		class A{ //Local class which can be accessed in that particular block scope is for that block
			public void print() {
				System.out.println("Salary is"+salary);
			}
		}
		A a = new A();
		a.print();
		
		final class B{
			
		}

	}
	
	public void show() {
		System.out.println("Show method is called");
		
	}
	
	public OuterClass() {
		class C{ //Local class can be created inside constructor
			
		}
		
	}
	
	{
		class C{ //Local class can be created in non static block{}
			
		}
	}
	
	static {
		class C{//Local class can be created in static block{}
			
		}
	}

}
