package jav.study.thistest;

public class ThisTest {
	public void show(Object o) {
		System.out.println("show smt");
		System.out.println(o.hashCode());
		
	}
	public void show2() {
		show(this);
		System.out.println();
	}
	public static void main(String[] args) {
		ThisTest thTest = new ThisTest();
		thTest.show2();
	}
}
