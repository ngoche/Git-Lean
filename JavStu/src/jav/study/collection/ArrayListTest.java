package jav.study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> lstString = new ArrayList<>();

		//Set<String> lstString = new TreeSet();
		
		lstString.add("C");
		lstString.add("D");
		lstString.add("A");
		lstString.add("B");
		Collections.sort(lstString);
		System.out.println(lstString);
		
		/*test null element*/
		List<String> lstString2 = new ArrayList<String>();
		lstString2.add(null);
		lstString2.add(null);
		System.out.println(lstString2);
		System.out.println(lstString2.get(0)== lstString2.get(0));

	}
}
