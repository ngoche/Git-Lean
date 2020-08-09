package jav.study.access.modifier.one;

public class Class5 extends Class6 {
//	private String name1;
//	String name2;
//	protected String name3;

	public static void main(String[] args) {
		//Samepackage //diff class //subclass
		Class5 cls5 = new Class5();
//		cls5.name1 = "";// private none access --err!!!
		cls5.name2 = "";// default
		cls5.name3 = "";// protected
		cls5.defaultMethod();
		cls5.protectedMethod();
		
		Class6 cls6 = new Class6();
		cls6.defaultMethod();
		cls6.protectedMethod();
		
		//same pack // non subclass 
		Class9 cl9 = new Class9();
//		cl9.name1 = "";// private none access --err!!!
		cl9.name2 = "";// default
		cl9.name3 = "";// protected
		cl9.defaultMethod();
		cl9.protectedMethod();
	}
}
