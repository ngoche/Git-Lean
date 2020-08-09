package jav.study.itor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItorMain {
	public static void main(String[] args) {
		List<String> lstStr = new ArrayList<String>();
		lstStr.add("henv1");
		lstStr.add("henv2");
		lstStr.add("henv3");
		Iterator it = lstStr.iterator();
//		it.forEachRemaining(System.out::println );
		while(it.hasNext())
			System.out.println(it.next());
	}
}
