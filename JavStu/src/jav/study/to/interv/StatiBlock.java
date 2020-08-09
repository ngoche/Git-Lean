package jav.study.to.interv;

public class StatiBlock {
	/*static block set value for variable
	private static int a;
	private static int b;

	private static void calculateSomething(int a, int b) {
		System.out.println("Result: " + (a + b));
	}

	static {
		int v_a = 12;
		int v_b = 13;
		calculateSomething(v_a, v_b);
	}

	public static void main(String[] args) {
		a = 10;
		b = 20;
		
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		StatiBlock.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		StatiBlock.b = b;
	}
*/
	/* static variable not setted before use, so let's see what happend 
	private static int var_a;
	private static String var_b;
	private static Integer interger_a;
	private static double doub_d;
	private static Double do_e;

	private static void show() {
		System.out.println("variable a: " + var_a + ", and b: " + var_b);
		System.out.println("\n: Integer: " + interger_a + ", double  " + doub_d + ", Double : " + do_e);
	}

	public static void main(String[] args) {
		show();
	}*/
	/*variable's value changing when it got a change action
	private static String var1;
	private static int var2;
	private String strVar;

	public static void main(String[] args) {
		StatiBlock obj1 = new StatiBlock();
		StatiBlock obj2 = new StatiBlock();
		obj1.var1 = "he dz";
		obj2.var1 = "a he dz";
		obj1.var2 = 10;
		obj2.var2 = 11;

		obj1.strVar = "abcd";
		obj2.strVar = "Henv";
		System.out.println(obj1.var1);
		System.out.println(obj2.var1);
		System.out.println(obj1.var2);
		System.out.println(obj2.var2);
		System.out.println(obj1.strVar);
		System.out.println(obj2.strVar);
	}*/
	
	static int i = 100;
	static String s = "Newbie static";

	static void display() {
		System.out.println("i: " + i);
		System.out.println("s: " + s);
	}

	void func() {
		display();
	}

	public static void main(String[] args) {
		StatiBlock obj1 = new StatiBlock();
		obj1.func();
		System.out.println("=>>>>> here's display method: ");
		display();
	}
}













