package com.prep.strings;

import java.util.Arrays;

public class FirstRepeatNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="java is easy";
		String arr[] = s1.split("");
		char a[] = s1.toCharArray();
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(Arrays.toString(arr));
		char b =a[0];
		char c=a[1];
		for(int i=0;i<=a.length;i++) {
			if(a[i] == a[i+1]) {
				b=a[i];
			}else {
				c=a[i];
			}
		}System.out.println(b);
		System.out.println(c);
		
		
		
//		String f = arr[0];
//		String n =arr[1];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<=arr.length;i++) {
//				if(arr[i] == arr[j]) {
//					f=arr[i];
//				}else {
//					n=arr[i];
//				}
//			}
//		}System.out.println(f);
//		System.out.println(n);
	}
	

}
