package jav.study.functioninterface;

public interface MyFunctionInterface {
	public void run1();
	public static void printl() {
		System.out.println("something");
	}
	default String abc() {
		return "henv";
	}
	
}
