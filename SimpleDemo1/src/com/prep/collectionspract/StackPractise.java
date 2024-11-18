package com.prep.collectionspract;

import java.util.Stack;

public class StackPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LIFO - LAST IN FIRST OUT -STACK
		//FIFO - FIRST IN FIRST OUT - QUEUE
		//IMPLEMENTS LIST INTERFACE AND EXTENDS VECTOR CLASS
		
		Stack<String> books = new Stack<>(); //we can alwyas create empty stack by deafult, we cannot craete stack with size as param or with list of elements
		books.add("Red");
		books.add("Black");  ///These all are opertations available via vector
		books.add(0, "White");
		System.out.println(books);
		//books.remove(0);
		books.set(0, "Green");
		System.out.println(books.get(1));
		System.out.println(books.contains("Red"));
		System.out.println(books);
		//Stack<Integer> s = new Stack<Integer>();
//		for(int i=0;i<books.size();i++) {
//			if(books.elementAt(i) == "+") {
//				books.a
//			}
//		}

	}

}
