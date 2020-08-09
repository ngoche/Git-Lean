package jav.study.to.interv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
/*henv co hay khong @Inherited thi sup-class van in ra duoc attribute's value cua clas cha???*/
//@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Myan {
	String name();

	String description() default "henv";
}

class SupperClz {
	@Myan(name = "name henv supper method")
	public void method() {

	}
}

public class AnnoInherited extends SupperClz {
//	public static void main(String[] args) {
//		SupperClz sup = new SupperClz();
//		Method m;
//		try {
//			m = sup.getClass().getMethod("method");
//			Myan myan = m.getAnnotation(Myan.class);
//			System.out.println(myan.name());
//		} catch (NoSuchMethodException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	@Myan(name = "name henv")
	public void anClzMethod() {

	}

	public static void main(String[] args) {
		AnnoInherited an = new AnnoInherited();
		try {
			Method m = an.getClass().getMethod("method");
			Myan myan = m.getAnnotation(Myan.class);
			System.out.println("henv check super method: " + myan.name());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}
}
