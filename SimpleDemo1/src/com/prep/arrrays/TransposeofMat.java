package com.prep.arrrays;

public class TransposeofMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,8,4},
				{9,7,2},
				{7,6,4}
		};
		int arr2[][] = new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[j][i] + " ");
			}System.out.println();
		}
		

	}

}
