package com.prep.casting;

public class TypeConversion {

	public static void main(String[] args) {
		byte b =10; //-128 to 127 = 256 Byte (0,1,2-----127, -128,-127,-126,------0,1,2)
		short s = 50; // -32768 to 32767 Short(0,1,2,3------32767, -32768,-32767,-----0,1,2)
		int i =258;
		float f = 25.1f;
		long l = 7847965;
		double d = 54.56;
		
		char ch ='A';
		boolean bo = true;
		
//		i =b;
//		System.out.println(i); //allthese are implicit conversions
//		s = b;
//		System.out.println(s);
//		f =b;
//		System.out.println(f);
//		l=b;
//		System.out.println(l);
//		d=b;
//		System.out.println(d);
		//d=i;
//		d = f;
//		System.out.println(d);
		
		//Limitations
		
		//b =(byte) s; //explicit conversion
		b =(byte) i;
		
		//b = (boolean)bo; //we cannot cast boolean values to any other data types
		//bo =(byte) b;// cannot be done on boolean (inncommaptable type)
		
		//when operations is performed it changes its datatypes
		
		//Automatic type promotion
//		byte b2 = b+10; //The part on right to '=' is in integer format
//		byte b3 = b+b; //byte,short char promotes to integer,
//		byte b4 = b+s;
//		byte b5 = b+ch;
//		
//		int i2 = i+d;//It automativally goes to bigger one in the given expression here int and double, double is big so it automatically goes to double
		long i3 = b+i+l;
		//s = (short)i;
		System.out.println(b);
		//System.out.println(s);
		
		System.out.println('A'+'B'); //here it will not return AB instead it sums the ascii value because char+char = int in automatic type promotion
		int i5 = 'A'+5+879562435;
		
		
	}

}
