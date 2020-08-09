package jav.study.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sset = new TreeSet<String>();
		sset.add("C");
		sset.add("B");
		sset.add("D");
		sset.add("C");
		System.out.println(sset);
	}
}
