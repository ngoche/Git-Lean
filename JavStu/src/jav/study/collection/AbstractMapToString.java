package jav.study.collection;

import java.util.AbstractMap;
import java.util.HashMap;

public class AbstractMapToString {
public static void main(String[] args) {
	AbstractMap<String, String> aMap = new HashMap<>();
	aMap.put("henv", "henv1");
	aMap.put("henv2", "henv.2");
	String stringMap = aMap.toString();
	System.out.println(stringMap.concat("abc"));
}
}
