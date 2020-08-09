package jav.study.serialzing;

public class Employee implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", address: " + this.address + ", SSN: " + this.SSN + ", Number: " + this.number;
	}
}
