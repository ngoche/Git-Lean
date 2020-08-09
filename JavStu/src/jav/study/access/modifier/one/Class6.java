package jav.study.access.modifier.one;

public class Class6 {
	private String name1;
	String name2;
	protected String name3;
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	private void privateMethod() {
		
	}
	void defaultMethod() {
		System.out.println("default method");
	}
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	
}
