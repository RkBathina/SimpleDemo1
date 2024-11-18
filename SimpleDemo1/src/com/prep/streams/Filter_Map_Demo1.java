package com.prep.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Filter_Map_Demo1 {

	public static void main(String[] args) {
//		List<Employee> es = new ArrayList<>();
//		es.add(new Employee(100, "Kittu", 25000));
//		es.add(new Employee(101, "Bathina", 30000));
		 //or//
		List<Employee> es = Arrays.asList(
		new Employee(100, "Kittu", 25000),
		new Employee(101, "Bathina", 30000),
		new Employee(102, "pandu", 90000),
		new Employee(103, "Rolex", 45000),
		new Employee(104, "Sai", 65000)
		);
		
		Set<Double> e1 = es.stream()
				.filter(n -> n.salary>30000)
				.map(n ->  n.salary)
				.collect(Collectors.toSet());
		System.out.println(e1);
	}

}


class Employee{
	int eid;
	String ename;
	double salary;
	
	Employee(int eid, String ename, double salary){
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
}
