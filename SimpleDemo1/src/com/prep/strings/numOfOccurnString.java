package com.prep.strings;

import java.util.Scanner;

public class numOfOccurnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//    	String s1 = sc.nextLine();
//    	String s2 =  sc.next();
		String s1 = "Hello world";
		char s = 'l';
    	int count=0;
    	for(int i =0;i<s1.length();i++) {
    		if(s1.charAt(i) == s){
    			count++;
    		}
    	}System.out.println(count);

	}

}
