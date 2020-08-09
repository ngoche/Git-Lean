package jav.study.functioninterface;

public class MyImplFunctionInterface implements MyFunctionInterface{

	@Override
	public void run1() {
		System.out.println("run");
		
	}
	MyFunctionInterface lambda = () -> {
		System.out.println("print something lambda");
	};
	public static void main(String[] args) {
		MyFunctionInterface.printl();
		MyFunctionInterface lambda = () -> {
			System.out.println("print something lambda");
		};
		MyFunctionInterface a = new MyImplFunctionInterface();
		System.out.println(a.abc());
	}
	
}
