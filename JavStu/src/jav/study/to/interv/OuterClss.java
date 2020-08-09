package jav.study.to.interv;

public class OuterClss {
	private static String msg = " mess from henv, this was declare as static";

	public static class NestedStaticClass {
		public void printMessage() {
			System.out.println("\"Message is : " + msg
					+ "\n And this is also nested class, I don't know it is :( fcking kidding\"");
		}
	}

	public class InnerClss {
		public void display() {
			System.out.println("\"this is inner clss, static msg is : " + msg + "--> \nI also have no fucking idea with this\n \"");
		}
	}

	public static void main(String[] args) {
		OuterClss.NestedStaticClass printer = new OuterClss.NestedStaticClass();
		printer.printMessage();
		System.out.println("\n*******************************************\n");
		OuterClss outerClz = new OuterClss();
		OuterClss.InnerClss inner =  outerClz.new InnerClss();
		inner.display();
		System.out.println("\n*******************************************\n");
		System.out.println("So, the another fcking thing is: we can short create");
		OuterClss.InnerClss inner2 = new OuterClss().new  InnerClss();
		System.out.println("Oh, fucking shit :O -->");
		inner.display();
	}
}