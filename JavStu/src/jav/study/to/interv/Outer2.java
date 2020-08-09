package jav.study.to.interv;

public class Outer2 {
	private static String utilMsg = "This is outer msg";

	private static class NesClzz {
		public void showMsg() {
			System.out.println("From Nested Class: " + utilMsg);
		}
	}

	private class InnerClz {
		public void showMsg() {
			System.out.println("From inner: " + utilMsg);
		}
	}
	public static void main(String[] args) {
		Outer2.NesClzz nestedClass = new Outer2.NesClzz();
		nestedClass.showMsg();
		System.out.println("\n*********************************\n");
		Outer2.InnerClz inner = new Outer2().new InnerClz();
		inner.showMsg();
	}
}
