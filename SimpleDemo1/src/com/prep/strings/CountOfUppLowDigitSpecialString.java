package com.prep.strings;

import java.util.Arrays;

public class CountOfUppLowDigitSpecialString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "JavA5is&Su6p%eR";
		System.out.println(string.length());
//		for(int i=0;i<string.length();i++) {
//			if()
//		}
//		
		int Uc=0;
		int Lc=0;
		int Sp=0;
		int Dig=0;
		String ar[] = string.split("");
		char c[] = string.toCharArray();
		for(int i=0;i<c.length;i++) {
		  if(Character.isUpperCase(c[i])) {
				Uc++;	
			}
		else if (Character.isLowerCase(c[i])) {
			Lc++;
			
		}else if (Character.isDigit(c[i])) {
			Dig++;
			
		}else {
			Sp++;
			
			
		}
		 
		}
		 System.out.println(Uc);
			System.out.println(Lc);
			System.out.println(Dig);
			System.out.println(Sp);
	}
}
		
//		System.out.println(Arrays.toString(ar));
//		System.out.println(ar.length);
//		for(int i=0;i<ar.length;i++) {
//			if(ar[i] == "ASCII (A") {
//				Uc++;
//				System.out.println(Uc);
//			}else if(ar[i] == "a to z") {
//				Lc++;
//				System.out.println(Lc);
//			}else if (ar[i] == "0 to 9") {
//				Sp++;
//				System.out.println(Sp);
//			}else {
//				Dig++;
//				System.out.println(Dig);
//			}
		
		
		
//		char c[] = string.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			if( ) {
//				
//			}
//		}
	


