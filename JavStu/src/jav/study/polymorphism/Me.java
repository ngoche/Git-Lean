package jav.study.polymorphism;

public class Me extends Paren {
	public static void main(String[] args) {
		Paren p = new Me();
		p.name = "cc";
		System.out.println(p.name);
		Me me = new Me();
		me.show();
	}
}
