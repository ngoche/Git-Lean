package jav.study.access.modifier.two;

import jav.study.access.modifier.one.Class6;

public class Class8 extends Class6 {
	public static void main(String[] args) {
		Class8 cls8 = new Class8();
//		cls8.name2 ="";// default//err
		cls8.name3= "";//protected
		
//		cls8.defaultMethod();//err
		cls8.protectedMethod();
	}
}
