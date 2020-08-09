package jav.study.thread;

public class DealLockThread extends Thread {
	public synchronized void test1() {
		System.out.println("test1");
		test2();
	}
	public synchronized void test2() {
		System.out.println("test2");
		test1();
	}
	@Override
	public void run() {
		test1();
	}
	public static void main(String[] args) {
		DealLockThread d = new DealLockThread();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}
}

