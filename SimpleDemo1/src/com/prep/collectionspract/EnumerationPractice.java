package com.prep.collectionspract;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class EnumerationPractice {

	public static void main(String[] args) {
		// Enumeration - Interface
		//Introduced for iterating the legacy collection objects
		//Legacy classes - v1.0 -Hashtable, stack,vector,Dictionary and properties
		//New clasees - v1.2 
		
		Stack<String> v = new Stack<>();
		//Vector<String> v = new Vector<>();
		v.add("Banana");
		v.add("Mango");
		v.add("Cherry");
		v.add("Apple");
		
		Enumeration<String> e = v.elements();
//		e.hasMoreElements();
//		e.nextElement();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		//Hash table
		Hashtable<Integer, String> ages = new Hashtable<>();
		ages.put(500, "India");
		ages.put(6000, "USA");
		ages.put(1000, "LOndon");
		
		Enumeration<String> e1 =  ages.elements(); //it only return values
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}
		
		Properties prop = new Properties();
		prop.setProperty("url", "localhost");
		prop.setProperty("uname", "password");
		
		Enumeration<Object> e2 = prop.elements();
		while (e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
			
		}
		prop.elements().asIterator(); //Enumaration to iterator
	}

}
