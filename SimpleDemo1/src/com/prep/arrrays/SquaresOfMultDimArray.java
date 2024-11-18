package com.prep.arrrays;

public class SquaresOfMultDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{2,3,5},
				{0,1,3},
				{1,2,4}
		};
		int arr2[][] = new int[arr.length][arr.length];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = arr[i][j] * arr[i][j];
				System.out.print(arr2[i][j] + " ");
			}System.out.println();
		}
		
	}

}
