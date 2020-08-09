package jav.study.thread;

import jav.study.generic.Test1;

public class Thread3 extends Thread {
	@Override
	public void run() {
		for (int i =0 ; i < 10 ; i ++)
			System.out.println(this.getName() + i);
	}
	public static void main(String[] args) {
		Thread3 t = new Thread3();
		Thread3 t2 = new Thread3();
		Thread3 t3 = new Thread3();

		t.setName("A");
		t2.setName("B");
		t3.setName("C");
		t3.setPriority(Thread.MAX_PRIORITY);
		//t.setPriority(Thread.MAX_PRIORITY);
	//	t2.setPriority(5);
		
		t.start();
		t2.start();
		t3.start();
		
	}
}
