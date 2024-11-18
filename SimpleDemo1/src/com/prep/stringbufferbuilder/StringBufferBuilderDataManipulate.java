package com.prep.stringbufferbuilder;

public class StringBufferBuilderDataManipulate {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();//default 16 capacity
		System.out.println(sb1.capacity());
		StringBuilder sb = new StringBuilder("Kittu");
		System.out.println(sb.capacity());
		//sb.insert(4, "Bathina");
		sb.insert(0, "Bathina");
		
		//sb.deleteCharAt(0);
		//sb.delete(0, 3);
		sb.reverse();
		sb.ensureCapacity(100); //explicitly giving capacity
		System.out.println(sb.capacity());
		System.out.println(sb);

	}

}
