package jav.study.thread;

public class ThreadSync extends Thread {
	private int tongHang;
	
	public ThreadSync() {
		this.tongHang = 9999;
	}
	public void muaHang(int soLuong) {
		if(tongHang > 0) {
			tongHang = tongHang - soLuong ;
			System.out.println("So hang con lai : "+tongHang);
		}else {
			System.out.println("hethang");
		}
	}
}
