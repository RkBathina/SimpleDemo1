package com.prep.multithreading;

public class TestMultiThreadingLoop {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			for(int i=0;i<10;i++) {
				//System.out.println("Hello Kittu Employee" + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
			}
			};
		Runnable r2 = () -> {
			for(int i=0;i<20;i++) {
				//System.out.println("Hi manger " + Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
			}
		};
		
		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		//t1.join(); //here we are stopping t2 and after completing t1 we are atrating t2
		t1.sleep(10000); //after completing t1 it waits for 10 seconds and then start executing t2
		
		t2.start();
		
		System.out.println(t1.getState());
		t1.start(); //once thread is terminated we cannot revive it (dies)
		//System.out.println(Thread.activeCount());
		
		//Thread life cycle
		// 0- New - new thread is crearted
		// 1- Running (Runnable) =it goes to runnable when we start thread
		//2- Blocked - when we use synchronize it waits for its term 
		//3- Waiting(join)
		//4-Timed Waiting(Specific Time/sleep)
		//5- Terminated - Thread dies
	}

}
