package com.prep.stringbufferbuilder;

public class TsetStringRecap {

	//Strings are Immutable 
	//to tackle this in java we have mutable strings(Stringbuffer(used in multithreaded env), Stringbuilder(used in single threaded env)
	
	public static void main(String[] args) {
		String s1 = "Kittu"; //This is string literals
		String s2 = "Kittu";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		s1 = s1+"Bathina"; 
		System.out.println(s1 == s2); //here we are getting false because when data is manipulated from above step addrees of s1 also being changed
		System.out.println(s1.equals(s2));
	
		String s3 = "KittuBathina";
		System.out.println(s1 == s3); //== operator compares address but not the content, if we need to compare text we can use equals metho
		System.out.println(s1.equals(s3));
		}
	
	//in STRINGS if we change data automatically it changes the address of the variable too.

}
