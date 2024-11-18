package com.prep.memory;

public class MemoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryTest m = new MemoryTest();
		m.add(1);
	}
	
	public void add(int i) {
		System.out.println(i);
		i++;
		add(i);
	}
	//19960
	//19926 
	
	//-Xss2m - stackmemeory chnage -41690 iterations
	
	//-Xss5m - stackmemory change 102000 iterations

}
