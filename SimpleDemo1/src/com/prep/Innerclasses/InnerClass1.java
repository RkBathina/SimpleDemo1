package com.prep.Innerclasses;

public class InnerClass1 {
	
	private int id = 101;
	public static void main(String[] args) {
		System.out.println("Inside Main Method: InnerClass1");
		InnerClass1 outer = new InnerClass1(); //object created for outer class
		InnerClass2 inner = outer.new InnerClass2(); // This is how we create object for inner class with the help of outer class object refernce variable
		//InnerClass2 inner = new InnerClass1().new InnerClass2();
		inner.show();
		System.out.println();
		InnerClass3 inner3 = new InnerClass1().new InnerClass3();
		inner3.sub();
		inner3.giveExam();
		System.out.println();
		InnerClass4 inner4 = new InnerClass1().new InnerClass4();
		System.out.println(inner4.getEmployeeid());
		inner4.calculateSalary();
		System.out.println();
		InnerClass6 inner6 = new InnerClass1.InnerClass6();//Object created for static inner class
		inner6.abc();
		
	}

	public class InnerClass2 extends Student{
		private int id = 102;
		public void show() {
			int id = 103;
			System.out.println(id); //Able to print print variable of outer class if id is not defined in inner class else inner class id value is printed
			System.out.println(this.id); //if we use this keyword inner class level id =102 is printed
			System.out.println(InnerClass1.this.id); //to print variable form outer class if variables are duplicated
			System.out.println(getMarks());//non abstract class method
			
		}
		public int getMarks() {
			return 201;
			
		}
		
		public void add() {
			InnerClass2 inner = new InnerClass2();
		}
	}
	
	public class InnerClass3 extends StudAbstrc{
		public void sub() {
			InnerClass2 inner = new InnerClass2();
			InnerClass2 inner2 = new InnerClass1().new InnerClass2();
			inner.show();
		}

		@Override
		public void giveExam() { //Extending abstract class
			// TODO Auto-generated method stub 
			System.out.println("Exam given");
		}
	}
	
	public class InnerClass4 implements Employee{

		@Override
		public int getEmployeeid() {
			// TODO Auto-generated method stub
			return id;
		}

		@Override
		public void calculateSalary() {
			// TODO Auto-generated method stub
			System.out.println("salary is 1000");
		}
		
	}
	
	public class InnerClass5 extends InnerClass2{
		public void abc() {
			show();
			add();
		}
	}
	
	public static class InnerClass6{ //static inner class
		public void abc() {
			System.out.println("abc");
		}
	}

}
