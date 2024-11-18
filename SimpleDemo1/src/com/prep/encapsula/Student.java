package com.prep.encapsula;

public class Student {

	 private int rollnum;
	 private String name;
	 private boolean isAttended;
	 
	
	public Student(int rollnum) {
		this.rollnum = rollnum;
	}

	public int getRollnum() {
		System.out.println("Inside getter of roll");
		return rollnum;

	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
		System.out.println("Inside setter of roll");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getisAttended() {
		System.out.println("teacher accessed student attendance data");
		return isAttended;
	}

	public void setAttended(boolean isAttended) {
		if(!isAttended)
		 this.isAttended = isAttended;
		System.out.println("Teacher marked attendance for student");
	}
	
	
	
	
}
