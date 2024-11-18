package com.prep.InnerclassBackend;

public class AnonymousforInterface {

	public static void main(String[] args) {
		Student s1 = new Student() {// anonymus class with interface
			
			@Override
			public int getMarks() {
				// TODO Auto-generated method stub
				int marks=100;
				return marks;
			}
			
			@Override
			public void attend() {
				System.out.println("Attendenae");
				
			}
		};
		s1.attend();
		System.out.println(s1.getMarks());

	}

}

