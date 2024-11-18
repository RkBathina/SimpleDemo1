package com.prep.accessmod;

public class Student {
	
	private int rollnum =101;
	
	
	
	private Student() {
		rollnum = 102;
	}



	public void printRollNumber() {
		System.out.println(rollnum);
		
	}
	
	private void abc() {
		printRollNumber();
		System.out.println(rollnum);
	}
	public static void main(String[] args) {
		Student student = new Student();
		
	}

}
