package jav.study.generic;

import jav.study.compare.Person;

public class Box<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	public static void main(String[] args) {
		Box<Person > person = new Box<>();
		person.add(new Person("henv", 27));
		System.out.println(person.get().toString());
			
	}
}
