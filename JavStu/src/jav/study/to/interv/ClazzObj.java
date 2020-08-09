package jav.study.to.interv;

public class ClazzObj {
	private String str;

	public ClazzObj() {
		str = "Henv Test";
	}

	public void method1() {
		System.out.println("The string is : " + str);
	}

	public void method2(int n) {
		System.out.println("The number is : " + n);
	}

	private void method3() {
		System.out.println("Private method invoked");
	}
}
