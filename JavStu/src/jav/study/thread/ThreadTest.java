package jav.study.thread;

public class ThreadTest extends Thread {
	private String threadName;

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public ThreadTest(String threadName) {
		super();
		this.threadName = threadName;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0 ; i < 10; i ++ )
			System.out.println(this.getThreadName());
	}
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest("a");
		ThreadTest t2 = new ThreadTest("b");
		t1.start();
		t2.start();
		
		
	}
}
