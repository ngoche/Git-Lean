package jav.study.thread;

public class ThreadSync extends Thread {
	private int tongHang;
	
	public ThreadSync() {
		this.tongHang = 9999;
	}
	public synchronized void muaHang(int soLuong) {
		if(tongHang > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tongHang = tongHang - soLuong ;
			System.out.println("So hang con lai : "+tongHang);
		}else {
			System.out.println("hethang");
		}
	}
	@Override
	public void run() {
		muaHang(9999);
	}
	public static void main(String[] args) {
		ThreadSync t = new ThreadSync();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		t2.start();
	}
}
