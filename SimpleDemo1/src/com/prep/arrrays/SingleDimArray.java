package com.prep.arrrays;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = new int[5];
//		a[0] = 7;
//		a[1] =3;
//		a[2] = 8;
//		a[3] =2;
//		a[4] = 1; 
//		
//		int b[] = {4,6,7,8,3,2,1};
//		// 
//		//a[5]=9;
//		System.out.println(a[4]);
//		//System.out.println(a[5]);
//		
//		for(int i=0;i<a.length;i++){
//			System.out.println(a[i]);
//		}
		String a[] = {"chai", "coffee"};
		String b[] = {"milk", "water", "coke"};
		String c[] = new String[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("Meged Array:" + String.join(", ", c));
	}

}
