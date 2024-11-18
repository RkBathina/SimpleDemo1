package com.prep.bank;

public class constructPrac {

	public int i;
	public static void main(String[] args) {
		
		constructPrac cp = new constructPrac(78);
		System.out.println(cp.i);
		
	}
	 public constructPrac() {
		 i =45;
		 System.out.println("B1 constructor called");
	 }
	 public constructPrac(int a) {
		 this.i=a;
		 System.out.println("B2 constructor called");
	 }
}
