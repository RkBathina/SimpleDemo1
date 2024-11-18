package com.prep.listassign;

import java.io.Serializable;

public class Employee implements Serializable  {
	
	int id;
	String name;
	double salary;
	String country;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, double salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "}";
	}
	
	

}
