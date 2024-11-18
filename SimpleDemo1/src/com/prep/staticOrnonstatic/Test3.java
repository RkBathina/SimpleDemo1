package com.prep.staticOrnonstatic;

public class Test3 {
	
	static int num;
	static {
		System.out.println("Static Block1");
		num =10;
	}
	static {
		System.out.println("Static Block2");
		num =10;
	}
	static {
		System.out.println("Static Block3");
		num =10;
	}
	{
		System.out.println("Non static block");
	}
	public Test3() {
		System.out.println("Constructor");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		Test3 t3 = new Test3();
		Test3 t4 = new Test3();
		Test3 t5 = new Test3();

	}

}
