package com.prep.inhert;

import com.prep.accessmod.Student;

public class SubClass extends Student {

	public void test() {
		System.out.println(rollnum);
		printRollNumber();
	}
	public static void main(String[] args) {
		new SubClass().test();
	}

}
