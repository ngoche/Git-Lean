package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;

public class fd {

	public static void main(String args[]) {
		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(101, "Vijay", 23));
		al.add(new Student2(106, "Ajay", 27));
		al.add(new Student2(105, "Jai", 21));

		Collections.sort(al);
		for (Student2 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class Student2 implements Comparable<Student2> {
	int rollno;
	String name;
	int age;

	Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student2 st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		return -1;
	}
}