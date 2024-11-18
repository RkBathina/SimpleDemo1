package com.prep.exceptionhandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExcept1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		TestExcept1 testExcept1 = new TestExcept1();
//		testExcept1.method1();
		
		//static method can be called in static main without object creation
		method1();

	}
	
	//StckTrace
	/*
	 * Exception name- java.lang.ArithmeticException
	 * Exception message -  / by zero
	 * Which line number-
	 * Methods info
	 */
	
	public static void method1() throws FileNotFoundException {
		System.out.println("Program execut start");
		int fNum=9;
		int snum=0;
		int result=0;
		
		File file = new File("D:/resume.docx"); // not files concept just for "throws" exceptioin handled by compiler
		FileInputStream fileInputStream = new FileInputStream(file);
		System.out.println(fileInputStream);
//		
		try {
			result = fNum/snum; 
		}catch (ArithmeticException ae) { //catch is optional when we have finally block, if we dont have finally block catch is mandatory
			// TODO: handle exception
			System.out.println(ae.toString());//write logic to enter this message into log files
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			throw ae;
		}finally {
			System.out.println("Finally block");//finally block is optional
		}
		
		
		
		System.out.println("Output is: "+result);
		System.out.println("Program end");
	}

}

//Note: we all know finally block execute every time even we have exception but if we use System.exit(0); thread will stop running and finally block and any code below that line will not execute.
