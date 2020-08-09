package jav.study.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		//LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("henv", 11);
		map.put("henv", 12);
		map.put("henv", 13);
		map.put(null, 1);
		map.put(null, 3);
		map.put(null,5);
		map.put(null, null);

		map.put("henv2", 23);
		map.put("henv2", 24);
		map.put("henv2", 25);
		map.put("henv2", 26);
		map.put("henv2", 27);
		System.out.println(map);
	}
}
