package com.prep.bank;

import java.util.Scanner;

public class conditionalStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested if
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		String day = sc.nextLine();
		if(day.equals("Monday")) {
			System.out.println("Uff,It's a weekday");
		}else if (day.equals("Tuesday")) {
			System.out.println("Uff,It's a weekday");
		}else if (day.equals("Wednesday")) {
			System.out.println("Uff,It's a weekday");
		}else if (day.equals("Thursday")) {
			System.out.println("Uff,It's a weekday");
		}else if (day.equals("Friday")) {
			System.out.println("Uff,It's a weekday");
		}else {
			System.out.println("Yayy, It's a weekend");
		}
		
		
//		int i = sc.nextInt();
//		if(i%2==0) {
//			System.out.println("Given num is even");
//		}else {
//			System.out.println("Given num is odd");
//		}

	}

}
