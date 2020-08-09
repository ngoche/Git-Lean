package jav.study.to.interv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Using target annotation to annotate a type 
@Target(ElementType.TYPE_USE)
// Declaring a simple type annotation 
@interface TypeAnnoDemo {
}

public class Anno {
	@Deprecated
	static void depreTest() {
		System.out.println("henv test deprecated");
	}

	public static void main(String[] args) {

		// Annotating the type of a string
		@TypeAnnoDemo
		String string = "I am annotated with a type annotation";

		System.out.println(string);
		System.out.println(abc());
		depreTest();
	}

	// Annotating return type of a function
	static @TypeAnnoDemo int abc() {
		System.out.println("This function's return type is annotated");
		return 110;
	}

	// This code is contributed by Charchit Kapoor

}
