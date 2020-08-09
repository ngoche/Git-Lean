package jav.study.thread;

public class Thread4 implements Runnable {
	volatile int NUM = 10;
	private static final Object counterLock = new Object();
	private static volatile int counter = 0;

	private void concurrentMethodWrong() {
		counter = counter + 5;
		System.out.println("counter of " + Thread.currentThread().getName() + counter);

		
		counter = counter - 5;

		System.out.println("counter of final " + Thread.currentThread().getName() + counter);
	}

	public static void main(String[] args) {
		Thread4 th1 = new Thread4();
		Thread4 th2 = new Thread4();
		Thread4 th3 = new Thread4();

		th3.NUM = 11;
//		th2.NUM = 12;

		Thread t = new Thread(th1);
		t.setName("A");

		Thread t2 = new Thread(th2);
		t2.setName("B");

		Thread t3 = new Thread(th3);
		t3.setName("C");

		t.start();
		t2.start();
		t3.start();

	}

	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName() + " --  " + NUM);
//		if (NUM == 10)
//			System.out.println("do something while  NUM == 10");
		concurrentMethodWrong();
	}
}
