package com.prep.stringbufferbuilder;

public class StringBufferBuilder {

	public static void main(String[] args) {
		//StringBuffer sb1 = new StringBuffer("Kittu"); //&24
		//StringBuffer sb2 = new StringBuffer("Kittu"); //37
		
		StringBuilder sb1 = new StringBuilder("Kittu"); //&24 //Both stringbuffer and sringbuffered functionality is same
		StringBuilder sb2 = new StringBuilder("Kittu");//37
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.compareTo(sb2));
		
		sb1=sb1.append("Bathina");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.compareTo(sb2));
		
		//StringBuffer sb3 = new StringBuffer("KittuBathina");//&44
		StringBuilder sb3 = new StringBuilder("KittuBathina");
		System.out.println(sb1 == sb3);
		System.out.println(sb1.compareTo(sb3));
		
		System.out.println("STring compare>>>>>>>>>>>>");
		String s1 = "Kittu"; //This is string literals //&47
		String s2 = "Kittu";//&47
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		s1 = s1+"Bathina"; //Address changed s1 to &51
		System.out.println(s1 == s2); //here we are getting false because when data is manipulated from above step addrees of s1 also being changed
		System.out.println(s1.equals(s2));
	
		String s3 = "KittuBathina";//&53
		System.out.println(s1 == s3); //== operator compares address but not the content, if we need to compare text we can use equals metho
		System.out.println(s1.equals(s3));

	}

}
