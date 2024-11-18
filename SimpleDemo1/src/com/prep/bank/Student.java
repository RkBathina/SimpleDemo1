package com.prep.bank;

//Diff types of varia

public class Student {
	//variables created in class but not in main and ccan be accessed globally callled global varia 
	//Instance varia or non static defined in class level not in main method
	int sid = 1001; //(we are not using static keyword so it is non static
	
	//class varia or static defined in class level not in main method
	static int id = 101; //(we areusing static keyword so it is static
	
	String name = "Kittu";
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variables created inside main method or any other method
		int height = 78;
		
		Student stud = new Student();
		System.out.println(stud.sid);
		System.out.println(id);
		test(100);
	}
	
	//parameters are give inside method
	//param can only be defined but cannot be intialized
	public static void test(int weight) {
		System.out.println(weight);
	}

}
