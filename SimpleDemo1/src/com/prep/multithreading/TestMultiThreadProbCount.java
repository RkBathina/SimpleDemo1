package com.prep.multithreading;

//Thread Race condition 
public class TestMultiThreadProbCount {

	public static void main(String[] args) throws InterruptedException {
		
		BrickDairy bd = new BrickDairy();
		Runnable r1 = () ->{
			for(int i=0;i<10000;i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		
		Runnable r2 = () ->{
			for(int i=0;i<15000;i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		
		Runnable r3 = () ->{
			for(int i=0;i<5000;i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(bd.brickcount);
		System.out.println(bd.brickcount2);
		System.out.println(Thread.activeCount());
	}

}

class BrickDairy{
	int brickcount =0;
	volatile int brickcount2 =0; //if we use volatile we may or may not get correct value, as it tries to get value from original value, no cacahe value (volatile is better when all threads are used for GETinng value but not manipulating
	
	//public synchronized void incrementBrickCount() { //method level just use synchronized key word which allows threads to wait if one thread is being used
	public void incrementBrickCount() {
		synchronized (this) { //this is synchronizing block of code
			brickcount += 50;
		}
		brickcount2 += 50;
	}
}

//we should not use synchronized every time as we may get deadlock because, as one thread accessing the block doesnot allow other waiting threads to access the block.

