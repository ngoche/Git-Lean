package jav.study.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class SetDemo {
	public static void main(String[] args) {

		String s1 = new String();
		s1 = "Henv";
		String s2 = new String();
		s2 = "Henv";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Set<String> lstSet = new HashSet<String>();
		lstSet.add(s1);
		lstSet.add(s2);
		for (String string : lstSet) {
			System.out.println(string);
		}
		Obj o = new Obj();
		System.out.println("o hash" + o.hashCode());

		Obj o2 = new Obj();
		System.out.println("o2 " + o2.hashCode());
//		TreeSet<E>
//		LinkedHashSet<E>s
//		HashMap<K, V>
//		Node
//		LinkedList<E>
//		Vector<E>
//		Iterable<T>
//		Number
//		HashSet
	}
}

class Obj {
	public Obj createFactory() {
		return this;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}