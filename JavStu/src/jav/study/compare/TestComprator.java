package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComprator {
	public static void main(String[] args) {
		List<Person2> lstPerson2 = new ArrayList<Person2>();

		lstPerson2.add(new Person2(4, "henv4"));
		lstPerson2.add(new Person2(3, "henv3"));
		lstPerson2.add(new Person2(2, "henv2"));
		lstPerson2.add(new Person2(1, "henv"));
		lstPerson2.add(new Person2(5, "henv5"));
		System.out.println("Before sorting: ");


		for (Person2 person2 : lstPerson2) {
			System.out.println(person2.getId());
		}
		
		System.out.println("After sorting: ");
		Collections.sort(lstPerson2, new Comparator<Person2>() {

			@Override
			public int compare(Person2 p1, Person2 p2) {
				if (p1.getId() > p2.getId())
					return 1;
				else if (p1.getId() == p2.getId())
					return 0;
				return -1;
			}

		});
		
		for (Person2 person2 : lstPerson2) {
			System.out.println(person2.getId());
		}
	}
}

class Person2 {
	private Integer id;
	private String name;

	public Person2(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}