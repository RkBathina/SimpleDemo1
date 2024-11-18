package com.prep.strings;

public class ModifyStringInPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1 = "This is a test String!!";
		String arr[] = s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(i==0 || i%2==0) {
				//char c[] = arr[i].toCharArray();
				System.out.print(arr[i].toUpperCase());
				
			}else {
				char c[] = arr[i].toCharArray();
				for(int j=c.length-1; j>=0; j--) {
					System.out.print(c[j]);
				}
			}System.out.print(" ");
		}
	}

}
