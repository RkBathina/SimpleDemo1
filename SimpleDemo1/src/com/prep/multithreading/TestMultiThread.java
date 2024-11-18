package com.prep.multithreading;

public class TestMultiThread {

	public static void main(String[] args) {
		//Default Threads in java for executing main method//
		/*System.out.println("Hello world");
		Thread thread = new Thread();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());*/
		
		//Once thread is created when its work is done thread is killed
		/*Thread t1 = new Thread(); //creates thread object not running
		t1.start();// thread started
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		Thread t4 = new Thread();
		t2.start();
		t3.start();  
		t4.start();
		System.out.println(Thread.activeCount());*/
		
		Employee e1 = new Employee("T1");
		e1.start();
		Manager m1 = new Manager("T2");
		m1.start();
		
		System.out.println(Thread.activeCount());
		
	}

}

class Employee extends Thread{
	
	public Employee(String tName) { //Changing the name of thread
		super(tName);
	}
	
	@Override //As we used override annotation explicitly we can provide our own code in run() method because bydefault in run() method we have some code but we need to give our own code. (As thread is class but not Abstract class or interface we dont have unimplemented methods)
	public void run() {
		System.out.println("Hello Kittu Employee" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
	}
}

class Manager extends Thread{
	
	public Manager(String tName) {
		super(tName);
	}
	
	@Override
	public void run() {
		System.out.println("Hello manger " + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
	}
}
