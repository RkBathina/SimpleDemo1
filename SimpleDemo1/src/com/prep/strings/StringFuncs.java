package com.prep.strings;

import java.util.Arrays;

public class StringFuncs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "HeLlo";
		String s2 = "hello";
		String s3 = "HELLO";
		String s4 = " Hello World ";
		String s5 = " Hello World how are you all";
		String s6 ="987";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("he"));
		System.out.println(s1.startsWith("He"));
		System.out.println(s3.endsWith("LO"));
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s4.trim());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toCharArray());
		char a[] = s2.toCharArray();
		System.out.println(s4.indexOf("W"));
		System.out.println(s4.lastIndexOf("o"));
		System.out.println(s4.substring(2,8));
		System.out.println(Arrays.toString(s5.split(" ")));
		System.out.println(s1.charAt(3));
		System.out.println(s1.replace("o", "k"));
		System.out.println(s5.replace("how", "kittu"));
		System.out.println(Integer.valueOf(s6));
		int j =8487858;
		String s7 = String.valueOf(j);
		System.out.println(s7.length());
		System.out.println(s7);
		String s8 = "  ";
		System.out.println(s8.isEmpty());
		System.out.println(s8.isBlank());
	}

}
