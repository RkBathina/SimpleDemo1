package com.prep.arrrays;

public class AddTwoMultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
		};
		
		int arr2[][] = {
				{2,6,8},
				{0,1,3},
				{1,2,4}
		};
		
		int arr3[][] = new int[arr1.length] [arr2.length];	
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}System.out.println();
		}
	}

}
