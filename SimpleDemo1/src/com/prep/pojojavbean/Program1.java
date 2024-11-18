package com.prep.pojojavbean;

import java.lang.reflect.Array;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEid(101);
		e.name = "kittu";
		e.salary = 5555.55;
		
		Employee e1 = new Employee();
		e1.setEid(102);
		e1.name = "Bathina";
		e1.salary = 6666.55;
		
		Employee e2 = new Employee();
		e2.setEid(103);
		e2.name = "kittu";
		e2.salary = 7777.55;
		
		Employee employee[] = new Employee[] {e,e1,e2};
		System.out.println(employee.length);
		double sal = 0;
		double tot=0;
		for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i].getEid());
			sal = employee[i].salary;
			tot += sal;
			System.out.println(sal);
		}
		System.out.println(tot);
		
//		Student student = new Student();
//		student.setSid(1001);
//		student.setSname("RK");
//		student.setMarks(676);
		
		
		
	}

}
