package jav.study.fileinout;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveObject {
	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		e.setName("Henv");
		e.setSalary(1000);
		

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		FileOutputStream f = new FileOutputStream("E:\\\\Download\\\\report2\\\\feck\\\\henv"+dateFormat.format(date)+".txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(e);
		o.close();
		f.close();
		
	}
}

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}