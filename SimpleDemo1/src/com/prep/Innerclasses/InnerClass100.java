package com.prep.Innerclasses;

import com.prep.Innerclasses.InnerClass1.InnerClass2;
import com.prep.Innerclasses.InnerClass1.InnerClass6;

public class InnerClass100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass2 inner2 = new InnerClass1().new InnerClass2();
		inner2.show();
		InnerClass6 inner6 = new InnerClass1.InnerClass6();//Object created for static inner class
		inner6.abc();
	}
	
	public class InnerClass101{
		InnerClass2 inner2 = new InnerClass1().new InnerClass2();
	}

}
