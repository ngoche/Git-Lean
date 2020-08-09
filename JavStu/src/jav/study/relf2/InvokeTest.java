package jav.study.relf2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTest {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		InvokeTest obj = new InvokeTest();
		Class  clazz= obj.getClass();
		try {
			Method method = clazz.getDeclaredMethod("setName", String.class);
			method.invoke(obj, "Haahahaha");
			System.out.println(obj.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
