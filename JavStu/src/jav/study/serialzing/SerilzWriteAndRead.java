package jav.study.serialzing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilzWriteAndRead implements Serializable {
	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.name = "NGO DAO NGUYEN";
//		Employee emp2 = new Employee();
//		emp2.name = "HAHAAHAA";
//		
//		try {
//			FileOutputStream fileOut = new FileOutputStream(new File("E:\\Download\\report2\\feck\\myObject.txt"));
//			ObjectOutputStream object = new ObjectOutputStream(fileOut);
//			object.writeObject(emp1);
//			object.writeObject(emp2);
//			object.close();
//			fileOut.close();
			

			try {
			FileInputStream fi = new FileInputStream(new File("E:\\Download\\report2\\feck\\myObject.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			e1 = (Employee) oi.readObject();
			e2 = (Employee) oi.readObject();
			System.out.println(e1.name);
			System.out.println(e2.name);
			oi.close();
			fi.close();
		} catch (Exception e) {
			
		}
	}
}
