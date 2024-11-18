package com.prep.pojojavbean;

public class Employee {
	private int eid;
	public String name; //As name, salary is not private we can directly acces them with object
	protected double salary;
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("No arg construt called");
	}
	public Employee(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
	 

}
