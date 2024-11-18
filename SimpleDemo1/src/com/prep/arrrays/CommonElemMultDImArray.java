package com.prep.arrrays;

import java.util.Set;
import java.util.TreeSet;

public class CommonElemMultDImArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
		};
		int arr2[][] = {
				{2,6,8,6},
				{0,1,3,9,7},
				{7,2,0},
				{8,3}
		};
		
		System.out.println("Common elem bet ayya:");
		commonElemBetArray(arr1,arr2);

	}

	public static void commonElemBetArray(int[][] arr1, int[][] arr2) {
		// TODO Auto-generated method stub
		Set<Integer> commIntegers = new TreeSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				int currElem = arr1[i][j];
				if(isElemPresnt(arr2, currElem)) {
					//System.out.println(currElem);
					commIntegers.add(currElem);
				}
			}
		}
		for( int elem : commIntegers) {
			System.out.println(elem);
		}
		
	}

	private static boolean isElemPresnt(int[][] arr2, int currElem) {
		// TODO Auto-generated method stub
		int count=0;
		boolean alreadyPrinted =false;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				if(currElem == arr2[i][j]) {
                        return true;
				}
			}
		}
		return false;
	}

}
