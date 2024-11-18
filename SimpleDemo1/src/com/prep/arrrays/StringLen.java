package com.prep.arrrays;

public class StringLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Diet Coke";
		int len = strLen(s);
		System.out.println("Length of string:" + len);
	}

	private static int strLen(String s) {
		// TODO Auto-generated method stub
		int c =0;
		for(int i=0;;i++) {
		try {
				char c1 = s.charAt(i);
				if( c1 != '\0') {
					c++;
				}else {
					break;
				}
				
			
		} catch (StringIndexOutOfBoundsException e) {
			break;
		}
		
	}
		return c;
	}

}
