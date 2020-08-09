package jav.study.to.interv;

import java.lang.reflect.Constructor;

public class ReflDemo {
	public static void main(String[] args) {
		ClazzObj clss = new ClazzObj();
		@SuppressWarnings("rawtypes")
		Class clazzInst = clss.getClass();
		System.out.println(clazzInst.getName());

		try {
			@SuppressWarnings("rawtypes")
			Constructor constr = clazzInst.getConstructor();
			System.out.println(constr.getName());
			System.out.println("another way:  "+ clazzInst.getConstructor().getName());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
