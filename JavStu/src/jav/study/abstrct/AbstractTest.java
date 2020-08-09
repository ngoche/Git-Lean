package jav.study.abstrct;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AbstractTest {
	public static void main(String[] args) {
//		ParentClass pClass = new Class3();
//		Class3 cls3 = new Class3();
//		cls3.mthod1();
		Class4 cls4 =  new Class4();
//		cls4.run();
//		Field[] f = cls4.getClass().getDeclaredFields();
//		for (Field field : f) {
//			System.out.println(field);
//		}
		if(1 ==1 | 0 == 0)
			System.out.println("check shit");
		try {
			System.out.println(cls4.getClass().getMethod("run",null ));
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ParentClass {
	public void run() {
		System.out.println("henv");
	}
}

abstract class Class1 extends ParentClass {
	abstract void mthod1();
	private void method3() {
		System.out.println("abstract class can be private");
	}
}

abstract class Class2 extends Class1 {
	//private abstract void abc();//ERROR---->>>> //can't be private
}
class Class3 extends Class2{
	final void fuk() {
		System.out.println("shit");
	}
	public void cc() {
		System.out.println("cc");
	}

	@Override
	void mthod1() {
		System.out.println("Override method 1 just happend only child class not abstraction");
		
	}
	
}
class Class4 extends Class3{
	
	 protected static String name;
	@Override
	public void cc() {
		System.out.println("method class 4");
	}
}