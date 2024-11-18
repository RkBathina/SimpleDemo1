package com.prep.memory;

public class Employee {
	
	int orgId = 76010;
	String orgName = "Kittu LLC"; //Instance variables
	String ceo = "Kittu";
	int noOfDepts = 2;
	static double netWorth = 500.00;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int eid =101;
		String ename = "Bathina"; // Local variables
		double salary =5000;
		Employee ee;//Reference variables
		Employee e1 = new Employee(); //objects
		e1.getOrgID();
		
		System.out.println(e1.getNetworth());
		
		Employee e2 = new Employee();
		e2.deleteEmployee(101);
		
		Thread.sleep(6000 );
	}
	 public int getOrgID() { //methods
		return orgId;
		 
	 }
	 
	 public static double getNetworth() {
		 return netWorth;
	 }
	 
	 public void deleteEmployee(int empID) {
		 //code
	 }
}
