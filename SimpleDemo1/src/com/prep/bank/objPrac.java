package com.prep.bank;

public class objPrac {
	int i ;
	int j;

	public static void main(String[] args) {
		objPrac sp =new objPrac();
		objPrac sp1 =new objPrac(56,80);
		objPrac sp2 =new objPrac(60,40);
		System.out.println(sp1.i);
		System.out.println(sp1.add());
		System.out.println(sp.add());
		System.out.println(sp2.add());
	}
	
	public objPrac() {
		i=50;
		j=98;
	}
	public objPrac(int i, int j) {
		this.i= i;
		this.j=j;
//		i=a;
//		j=b;
	}
	public int add() {
		return i+j;
		
	}

}
