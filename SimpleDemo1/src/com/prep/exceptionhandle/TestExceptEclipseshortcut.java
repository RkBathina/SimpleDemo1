package com.prep.exceptionhandle;

public class TestExceptEclipseshortcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = {1,2};               //Select all the lines u need to keep in try block and right click and select surrond with try catch
			System.out.println(arr[2]/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main");
	}

}
