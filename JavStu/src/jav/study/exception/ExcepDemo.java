package jav.study.exception;

public class ExcepDemo {
	public static void show() throws IndexOutOfBoundsException {
		int[] ar = { 1, 2 };
		System.out.println(ar[3]);
	}
	public static void main(String[] args) {
		try {
			
			show();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
