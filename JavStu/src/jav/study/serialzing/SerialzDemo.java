package jav.study.serialzing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialzDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "TEN";
		e.address = "TRAN-DUY-HUNGGGGGGGGG";
		e.SSN = 11122333;
		e.number = 101;
		try {
			FileOutputStream  fileOut = new FileOutputStream("E:\\Download\\report2\\feck\\clgt.txt");
			ObjectOutputStream  out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Done");
			FileInputStream fis = new FileInputStream("E:\\Download\\report2\\feck\\clgt.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				Employee eee = (Employee) ois.readObject();
				System.out.println(eee.toString());
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
}
