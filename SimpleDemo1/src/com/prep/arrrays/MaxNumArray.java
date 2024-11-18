package com.prep.arrrays;

public class MaxNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,1,9,6};
		int max =a[0];
		int index =0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
				index = i;
			}
		}
		System.out.println("Maxval:"+max);
		System.out.println("Index:"+index);
	}

}
