package jav.study.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	public static void main(String[] args) {
		List<Integer> lstInteger = new ArrayList<Integer>();
		lstInteger.add(1);
		lstInteger.add(1);
		lstInteger.add(1);
		lstInteger.add(1);
		syoutList(lstInteger);
	}

	private static void syoutList(List<? extends Object> lst) {
		System.out.println(lst);
	}
}
