package com.prep.arrrays;

public class MinLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String a[] = {"coffee", "water", "chai", "diet coke"}; int min =
		 * a[0].length(); int index = 0; for(int i=0; i<a.length;i++) {
		 * if(a[i].length()< min) { min = a[i].length(); index = i; }
		 * }System.out.println(a[index]); System.out.println(index);
		 */
		String a[] = {"coffee", "water", "chai", "Diet coke"};
		int min = strLen(a[0]);
		int index=0;
		
		for(int i =0; i< a.length;i++) {
			if(strLen(a[i]) < min) {
				min = strLen(a[i]);
				index = i;
			}
		}System.out.println("Valuye is:" + a[index]);
		System.out.println("String Len:" + min);
		System.out.println("String ind:" + index);
	}
	
	public static int strLen(String sc) {
		int l =0;
		for(int i=0;;i++) {
			try {
				char c = sc.charAt(i);
				if(c != '\0') {
					l++;
				}else {
					break;
				}
			} catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
				break;
			}
		}
		return l;
		
	}

}
