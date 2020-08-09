package jav.study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveAList {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(3);
		lst.add(4);
		lst.add(2);
		lst.add(2);
		lst.add(1);
		lst.add(7);
		Iterator<Integer> it = lst.iterator();
		while (it.hasNext())
			if (it.next() == 3)
				it.remove();
		
		for (Integer integer : lst) {
			System.out.println(integer);
		}

	}

}
