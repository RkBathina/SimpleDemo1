package com.prep.memory;

public class HeapMemoryFull {

	public static void main(String[] args) {
		int size =10;
		for(int i=0;i<Integer.MAX_VALUE;i++) {   //we got Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
			int arr[] = new int[size];   
			size *= 2;
			System.out.println(size);
		}

	}


}
 //-Xmx100m  --- reduced heap memory
//Xmx8000m -- -1610612736

// -Xmx500m - heap memory 