package com.prep.interfaces;

public class User2Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Lenovo1 lenovo1 = new Lenovo1();
//		lenovo1.copy();
//		lenovo1.cut();
//		lenovo1.paste();
//		lenovo1.keyboard();
//		lenovo1.security();
////		Laptop.audio();
//		
//		HP1 hp1 = new HP1();
//		hp1.copy();
//		//hp1.security();
		
		//to achieve abstarction we can use laptop(interface) and create object for specific aompany ex lenovo
		
		Laptop lenovo = new Lenovo();
		lenovo.copy();
		lenovo.paste();
		
		
		

	}
  
}
