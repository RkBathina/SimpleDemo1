package com.prep.bank;

public class OperatorPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =20;
		int j=6;
		
		int k= i++ + ++i +i-- - --i;
		System.out.println(k );
//		System.out.println(i%j);
//		
//		//unary op ++,--
//		//i++;
//		//j--;
//		System.out.println(i); //20
//		System.out.println(++i);//21
//		System.out.println(i++);//21
//		System.out.println(i);//22
//		
//		//System.out.printf("%d,%d",i,j);
		
		//relational
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i<j);
		System.out.println(i>j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		
		//conditional oper &&, ||
		System.out.println(i>j && i!=j);
		
		//Assignmnet
		//i +=5;
		i -=5;
		System.out.println(i);
		

	}

}
