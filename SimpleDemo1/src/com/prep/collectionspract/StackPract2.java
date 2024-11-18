package com.prep.collectionspract;

import java.util.Stack;

public class StackPract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PUSH POP PEEK SEARCH also EMPTY
		Stack<String> books = new Stack<>();
		books.add("Red");
		books.add("Black");  
		books.add("White");
		books.push("White");
		books.push(null);
		books.push("Black");
		
		System.out.println(books);
		System.out.println(books.set(0, "Grey"));
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println(books.set(0, "Grey"));
		//System.out.println(books.pop());
		//System.out.println(books); 
		//System.out.println(books.push("White"));
		System.out.println(books.search("Black"));
		System.out.println(books.search("White"));
		System.out.println(books.indexOf("White"));
		System.out.println(books.isEmpty());
		System.out.println(books.empty()); //stack method empty is same as isempty
		System.out.println(books); 
		
	}

}
