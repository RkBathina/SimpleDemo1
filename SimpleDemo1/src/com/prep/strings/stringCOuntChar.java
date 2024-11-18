package com.prep.strings;

import java.util.Arrays;
import java.util.Scanner;

public class stringCOuntChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine();
		String s1 = "java is super";
		System.out.println(s1.length());
		
		//words in string
		//char a[] = s1.toCharArray();
//		System.out.println(a);
		
		System.out.println(Arrays.toString(s1.split(" ")));
		String srr[] = s1.split(" ");
		System.out.println(srr.length);
	}

	
}
