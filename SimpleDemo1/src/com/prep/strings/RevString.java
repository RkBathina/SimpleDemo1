package com.prep.strings;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is super";
		char a[] = s.toCharArray();
		System.out.println(a);
		System.out.println(a.length);
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}

	}

}
