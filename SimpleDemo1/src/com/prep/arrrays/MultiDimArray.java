package com.prep.arrrays;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {
				{1,8,4},
				{9,7,2},
				{7,6,4}
		};
		int sum=0;
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + " ");
//			}System.out.println();
//		}
		
		//Sum of elem in multidim array
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum = sum+arr[i][j];
			}
		}System.out.println("Sum of elem in array:" + sum);
				
				
	}

}
