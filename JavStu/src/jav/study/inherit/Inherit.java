package jav.study.inherit;

public class Inherit extends Parent {
	public static void main(String[] args) {
		Parent p = new Inherit();
		p.run();
		PInterface pi = new Parent();
		pi.smt();
		PInterface piInherit = new Inherit();
		piInherit.smt();
		
	}
	@Override
	public void smt() {
		System.out.println("Inherit smt");
	}
}

class Parent implements PInterface {
	public void run() {
		System.out.println("run");
	}

	@Override
	public void smt() {
		System.out.println("do smt");
	}
}

interface PInterface {
	void smt();
}