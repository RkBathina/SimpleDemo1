package com.prep.bank;

public class Bankmethodsdemo {
	
	static int currbal = 100;
	
	
	public static void greetCustomer() {
		System.out.println("Hello Customer");
	}
	
	public void deposit(int amount) {
		currbal = currbal+amount;
		System.out.println("Amount deposit success");
		
		
	}
	public static void withdraw(int amount) {
		currbal = currbal-amount;
		System.out.println("Amount withdraw success");
		 
	}
	
	public int getcurreentbal() {
		return currbal;
		
	}
	public static void main(String args[]) {
		Bankmethodsdemo bank = new Bankmethodsdemo();
		greetCustomer(); //As the method greetcustomer is static we can directly call without creating obj
		System.out.println("curr ba:"+bank.getcurreentbal());
		bank.deposit(400);
		System.out.println("curr ba:"+bank.getcurreentbal());
		withdraw(200);
		System.out.println("curr ba:"+bank.getcurreentbal());
	}

}
