package com.prep.inhert;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest guest =  new Guest();
		guest.read();
		System.out.println();
		Developer developer =  new Developer();
		developer.read();
		developer.write(); 
		System.out.println();
		Admin admin = new Admin();
		admin.read();
		admin.write();
		admin.manage();

	}

}
