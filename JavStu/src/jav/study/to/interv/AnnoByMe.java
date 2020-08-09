package jav.study.to.interv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD })
@interface MyOwnAnn {
	String anName() default "annnoooooooo";

	int anNum();

}

public class AnnoByMe {

	@MyOwnAnn(anNum = 999, anName = "Constructor anName() haahahahahhahahah")
	public AnnoByMe() {
		System.out.println("Constructor called!");
	}

	@MyOwnAnn(anNum = 111)
	public void testMethod() {

	}

	@Deprecated
	public void testDeprecate() {
		@SuppressWarnings("unused")
		Date d = new Date(2020, 10, 10);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AnnoByMe myAno = new AnnoByMe();
		try {
			Method mthod = myAno.getClass().getMethod("testMethod");
			MyOwnAnn ano = mthod.getAnnotation(MyOwnAnn.class);
			System.out.println(ano.anName());

			Constructor cstr = myAno.getClass().getConstructor();
			MyOwnAnn ano2 = (MyOwnAnn) cstr.getAnnotation(MyOwnAnn.class);
			System.out.println(ano2.anName());
			
			/*just add test deprecated annotation*/
			myAno.testDeprecate();
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
