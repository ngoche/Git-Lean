package jav.study.to.delete;

import java.util.HashMap;
import java.util.Map;

public class Delete {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
//		
//		Map<Integer, String> map = new HashMap<Integer,String>();
//		map.put(1,"henv");
//		map.put(1,"haha");
//		System.out.println(map);
//		map.put(2,"henv");
//		map.putIfAbsent(2, "hnv");
//		System.out.println(map);
//		map.computeIfAbsent(3, k -> {
//			String value = "";
//			value +="h" + "env";
//			return value;
//		});
//		System.out.println(map);
		comp();
//		System.out.println(equ("henv", "henv"));
	}

	public static String comp() {

		Object s1 = null;
		Object s2 = "henv";
		Object s3 = "henv";
		Object s4 = null;
		Object s5 = "henv";
		Object s6 = "hatrang";
		if ( equ(s2,s6) | equ(s3,s5) |  equ(s1, s2) | equ(s1, s3)  | equ(s2, s3) )
			return "henv";
		return null;
	}

	public static boolean equ(Object o, Object o1) {
		System.out.println(o + " - " + o1);
		if (o.equals(o1))
			return true;
		return false;
	}
}