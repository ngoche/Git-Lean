package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {
	String name;
	int age;

	@Override
	public int compareTo(Person o) {

		return getName().compareTo(o.getName());
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name: " + this.name + " age: " + this.age ;
	}
	static class AgeComparator implements Comparator<Person> {

		public int compare(Person per1, Person per2) {
			int age1 = per1.getAge();
			int age2 = per2.getAge();
			if (age1 == age2)
				return 0;
			else if (age1 > age2)
				return 1;
			return -1;
		}

	}
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
        people.add( new Person("Marge", 35) );
        people.add( new Person("Homer", 38) );
        people.add( new Person("Lisa", 13) );
        people.add( new Person("Bart", 15) );
        /*sort descending age
        Collections.sort(people, Collections.reverseOrder(new Person.AgeComparator()));
        people.forEach(pp -> System.out.println(pp.toString()));
        */
        /*sort age ascending -- which use static class sort*/
        Collections.sort(people,new Person.AgeComparator());
        people.forEach(pp -> System.out.println(pp.toString()));
	}
}
