package jav.study.access.modifier.two;

import jav.study.access.modifier.one.Class5;
import jav.study.access.modifier.one.Class6;
import jav.study.access.modifier.one.Class9;

public class Snippet {
	public static void main(String[] args) {
		Class5 cls = new Class5();
//		cls.name1 = "";//Error
//		cls.name2 = "";//Error
//		cls.name3 = "";//Error
		//diff package // same project // diff class
		Class6 cls6 = new Class6();
//		cls6.name1 = "";//Error
//		cls6.name2 = "";//Error
//		cls6.name3 = "";//Error
		
//		cls6.defaultMethod(); 
//		cls6.protectedMethod();
		Class9 cl9 = new Class9();
//		cl9.name2 = "";//err
//		cl9.name3 = "";//err
		
	}
}

