package com.prep.encapsula;

public class Teacher {
	
	public static void main(String[] args) {
		Student student = new Student(101);
		
		//student.isAttended = true;
		student.setAttended(true);
		System.out.println(student.getisAttended());
		
		student.setRollnum(101);
		System.out.println(student.getRollnum());
		student.setRollnum(101);
		
		
	}

}
