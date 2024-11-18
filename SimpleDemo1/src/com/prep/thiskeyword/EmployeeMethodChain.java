package com.prep.thiskeyword;

public class EmployeeMethodChain {
	
	int age;
	String name;
	String jobRole;

	public static void main(String[] args) {
		EmployeeMethodChain e1 = new EmployeeMethodChain();
//		e1.setAge(25); // As we made changes to setter method as shown below we can pass values in single line
//		e1.setName("Kittu");
//		e1.setJobRole("Student");
		
		e1.setAge(25).setName("Kittu").setJobRole("Student");
		System.out.println(e1.getAge());

	}

	public int getAge() {
		return age;
	}

	public EmployeeMethodChain setAge(int age) { // here we changed setter method from void to EMployeemethodchain(class name)
		this.age = age;
		return this;       // returned this which is instance of same class
	}

	public String getName() {
		return name;
	}

	public EmployeeMethodChain setName(String name) {
		this.name = name;
		return this;
	}

	public String getJobRole() {
		return jobRole;
	}

	public EmployeeMethodChain setJobRole(String jobRole) {
		this.jobRole = jobRole;
		return this;
	}

}
