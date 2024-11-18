package com.prep.wrapperclass;

import java.util.ArrayList;

public class WrapperClassTest {

	public static void main(String[] args) {
	
// Primitive data types	-> //Corresponding wrapper class
		/*byte          -> Byte
		 *short         -> Short
		 *int           -> Integer
		 *double        -> Double
		 *float         -> Float
		 *long          -> Long
		 *char          -> Character
		 *boolean       -> Boolean
		 */
		 int  i=20; //this is not object or class
		 
		 Integer iii = 90;
		 
		 WrapperClassTest wc = new WrapperClassTest();
		 Integer i2 = new Integer(i); // Boxing - Because i is primitive data type we are wrapping in a box that is boxing
		 Integer i3 = i;// Auto -Boxing -> Here we are assigning primitive data type to Wrapper class instance , then java wrappes i3 object to primitive data type i
		 
		 Integer i4 = Integer.valueOf(i); //Boxing - This is also boxing as primitive data type is wrapped, but the above method is depricated we need to use this method
		 System.out.println(i2);
		 
		 Integer i5 = Integer.valueOf(55);
		 int ii = i5.intValue(); // Unboxing - Here we are assigning value to primitive data type(ii) from the object of Integer wrapper class i5
		 int ii1 = i5; //Auto-UnBoxing
		 
		 ArrayList<Integer> al = new ArrayList<>();
		 al.add(24);//Auto-Boxing internally done by java
		 al.add(25);
		 al.add(Integer.valueOf(65)); //Boxing
		 
		 int ii2 = al.get(0); //Auto- Unboxing
		 
		 byte b =55;
		 double d =10.2;
		 short s = (short) d;
		 
		 String x = "14";
		// int age = x; //we cannot get value like this as in type conversion concept we cannot convert string to int, it can be done by Integer Wrapper class
		 int age1 = Integer.valueOf(x); //value of returns Integer wrapper class object
		 Integer age3 = Integer.valueOf(x);
		 int age2 = Integer.parseInt(x); //Parseint returns primitive datatype
		 
		 Long age = Long.valueOf(x);
		 int lage = age.intValue();
		 
		 System.out.println(age1);
		 System.out.println(age2);
	}

}
 //Note - Boxing and Unboxing is used for collections ffarme work