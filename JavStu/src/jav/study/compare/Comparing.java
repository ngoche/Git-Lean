package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparing {
	private static List<CStd> lstStd = new ArrayList<>();
	static {
		lstStd.add(new CStd("Henv2", "type3"));
		lstStd.add(new CStd("Henv", "type1"));
		lstStd.add(new CStd("Henv3", "type4"));
		lstStd.add(new CStd("Henv1", "type2"));
	}
	public static void main(String[] args) {
		System.out.println("Before sort: ");
		lstStd.forEach(st -> System.out.println(st.getName()));
		Collections.sort(lstStd, Comparator.comparing((CStd st) -> st.getName()));
		System.out.println("After sort with Comparator.comparing");
		lstStd.forEach(st -> System.out.println(st.getName()));
	}
}
