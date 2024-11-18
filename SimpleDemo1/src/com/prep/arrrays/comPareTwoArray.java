package com.prep.arrrays;

public class comPareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int arr1[][] = {
						{1,2,1},
						{9,7,2},
						{7,6,4}
				};
				
				int arr2[][] = {
						{1,6,1},
						{0,7,3},
						{1,6,4}
				};
				
				int arr3[][] = new int[arr1.length] [arr2.length];	
				for(int i=0;i<arr3.length;i++) {
					for(int j=0;j<arr3[i].length;j++) {
						if(arr1[i][j] == arr2[i][j]) {
							arr3[i][j] = 1;
						}else {
							arr3[i][j] = 0;
						}
						System.out.print(arr3[i][j] + " ");
					}System.out.println();
				}
			}


}
