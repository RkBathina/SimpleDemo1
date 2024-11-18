package com.prep.strings;

public class RevEachWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java is easy";
		String a[] = s1.split(" ");
		//char b[] = s1.toCharArray();
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			char c[] = a[i].toCharArray();
			for(int j = c.length -1;j>=0;j-- ) {
				System.out.print(c[j]);
				
			}System.out.print(" ");
			
		}
		
	}

}
