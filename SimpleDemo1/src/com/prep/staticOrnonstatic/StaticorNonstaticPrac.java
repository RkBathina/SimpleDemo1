package com.prep.staticOrnonstatic;

import java.util.Random;

public class StaticorNonstaticPrac {
	
	//int num;
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can easly access static variab with class name
		
		
		StaticorNonstaticPrac t1 = new StaticorNonstaticPrac();
		t1.num = new Random().nextInt();
		

		StaticorNonstaticPrac t2 = new StaticorNonstaticPrac();
		t2.num = new Random().nextInt();
		

		StaticorNonstaticPrac t3 = new StaticorNonstaticPrac();
		t3.num = new Random().nextInt();
		
		System.out.println(t1.num);
		System.out.println(t2.num);
		System.out.println(t3.num);
		
		StaticorNonstaticPrac.num = new Random().nextInt();
		StaticorNonstaticPrac.num = new Random().nextInt();
		StaticorNonstaticPrac.num = new Random().nextInt();
		StaticorNonstaticPrac.num = new Random().nextInt();
		
		System.out.println(StaticorNonstaticPrac.num);
		System.out.println(StaticorNonstaticPrac.num);
		System.out.println(StaticorNonstaticPrac.num);
	}

}
 