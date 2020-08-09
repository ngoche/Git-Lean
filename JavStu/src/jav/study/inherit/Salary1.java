package jav.study.inherit;

public class Salary1 extends Employee1 {

	public Salary1(String name) {
		super(name);
	}
	public void check() {
		System.out.println("Sala");
	}
	public static void main(String[] args) {
		Employee1 e = new Salary1("Henv");
		e.check();
		Salary1 s = new Salary1("Henv2");
		s.check();
	}
}

class Employee1 {
	private String name;

	public Employee1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void check() {
		System.out.println("Emp");
	}
}