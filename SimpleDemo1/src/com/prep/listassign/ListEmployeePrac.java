package com.prep.listassign;

import java.util.Arrays;
import java.util.Vector;

public class ListEmployeePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> v1 = new Vector<>();
		Employee e1 = new Employee(101, "Kittu", 7777.7, "INDIA");
		Employee e2 = new Employee(102, "Vishnu", 8888.89, "USA");
		Employee e3 = new Employee(103, "Sai", 5555.7, "INDIA");
		Employee e4 = new Employee(104, "Sar", 9998.89, "USA");
		
		
		//Employee e3 = new Employee(0, null, 0, null)
//		Employee e4 = new Employee();
//		e4.setId(101);
//		e4.setName("Rama");
//		e4.setSalary(7777.77);
//		e4.setCountry("INDIA");
//		
//		Employee e5 = new Employee();
//		e5.setId(102);
//		e5.setName("Rama");
//		e5.setSalary(7777.77);
//		e5.setCountry("INDIA");
		
		v1.add(e1);
		v1.add(e2);
		v1.add(e3);
		v1.add(e4);
		
		
		System.out.println(v1);
		
		double tot=0;
		for (Employee employee : v1) {
			
			if(employee.getCountry().equals("INDIA")) {
				tot += employee.getSalary();
			}
		}
		System.out.println(tot);
		System.out.println("USA");
		for (Employee employees : v1) {
			
			if(employees.getCountry().equals("USA")) {
				System.out.println(employees.getName());
			}else if (employees.getCountry().equals("INDIA")) {
				System.out.println(employees.getName());
				
			}
			
		}
	}

}
 