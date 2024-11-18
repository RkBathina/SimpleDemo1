package com.prep.staticOrnonstatic;

public class Test2 {
	
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Non static block");
	}
	public Test2() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
	}

}
