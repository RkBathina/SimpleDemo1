package com.prep.multithreading;

public class TestMultiThreadInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1();
		Thread t1 =new Thread(e1);
		t1.start();
		
		Manager1 m1 = new Manager1();
		//Thread t2 = new Thread(m1);
		Thread t2 = new Thread(m1, "T2");
		t2.start();
		
		User1 u1 = new User1();
		u1.start();
		
		Runnable r1 = new Runnable() { //Instead of implementing interface in new class we can create anonymous class
			
			@Override
			public void run() {
				System.out.println("Hello Kittu Employee from Anonymous" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
			}
		};
		Thread t3 = new Thread(r1);
		t3.start();
		
		Runnable r2 = new Runnable() { //Instead of implementing interface in new class we can create anonymous class
			
			@Override
			public void run() {
				System.out.println("Hello manger from Anonymous" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
				
			}
		};
		Thread t4 = new Thread(r2, "TMange");
		t4.start();
		
		Thread t5 = new Thread() { //Instead of extending  class in new class we can create anonymous class
			public void run() {
				System.out.println("Hello User from Anonymous class" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
				
			}
		};
		
		t5.start();
		
		//Threads with lamba expression as our interface is Functional
		Runnable r3 = () -> System.out.println("Hello Kittu Employee from lambda expression" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
		Runnable r4 = () -> System.out.println("Hello manger lambda expression" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
		Thread t6 = new Thread(r3);
		Thread t7 = new Thread(r4, "Threadmangelambda");
		t6.start();
		t7.start();
		
		System.out.println(Thread.activeCount());
		
	}
	
}

class Employee1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello Kittu Employee" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
		
	}
	
}


class Manager1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello manger " + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
	}
	
}

class User1 extends Thread implements Runnable{ //This threading with interface is useful as we know multiple inheritance is not possible with java in class level we can use multiple interfaces and use methods

	@Override
	public void run() {
		System.out.println("Hello User" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
		
	}
	
}
