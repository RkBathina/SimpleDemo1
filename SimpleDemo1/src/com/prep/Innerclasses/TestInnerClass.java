package com.prep.Innerclasses;

//Types of inner classes
	//non-static inner class ---(nested)
	//static inner class ----(nested) 
	//local classes
	//Anonymous inner class/ Anonymous class

public class TestInnerClass { //This is outer class
	int id =101;

	public static void main(String[] args) {
		System.out.println("In main method: Testcinnerclass");
	}
    public class TestInnerClass9{
    	public static void main(String[] args) {
		
    	}
    }
	
public class TestInnerClass3{ //This is inner class
		public static void main(String[] args) {
			System.out.println("In main method: Testcinnerclass3"); //we can declare main method inside inner class

		}}
private	class TestInnerClass4{ //This is inner class we can define more than one inner class
			public static void main(String[] args) {
				System.out.println("In main method: Testcinnerclass4");
			}
}
protected	class TestInnerClass5{ //This is inner class we can define more than one inner class
		public static void main(String[] args) {
			System.out.println("In main method: Testcinnerclass5");
		}
}

//stsic/abstract/final

public static class TestInnerClass6{ 
	public static void main(String[] args) {
		System.out.println("In main method: Testcinnerclass6");

	}}
private abstract class TestInnerClass7{ 
		public static void main(String[] args) {
			System.out.println("In main method: Testcinnerclass7");
		}
}
protected	final class TestInnerClass8{ 
	public static void main(String[] args) {
		System.out.println("In main method: Testcinnerclass8");
	}
}

	
}

class TestInnerClass1{
	public static void main(String[] args) {
		System.out.println("In main method: Testcinnerclass1");

	}
}

class TestInnerClass2{
	public static void main(String[] args) {
		System.out.println("In main method: Testcinnerclass2");

	}
}


