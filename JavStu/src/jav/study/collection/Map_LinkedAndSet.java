package jav.study.collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedAndSet {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("henv", 11);
		map.put("henv", 12);
		map.put("henv", 13);
		map.put(null, 1);

		map.put("henv2", 23);
		map.put("henv2", 24);
		map.put("henv2", 25);
		map.put("henv2", 26);
		map.put("henv2", 27);

		System.out.println(map);

		System.out.println("\nMap Entry Example: ");
		System.out.println("\nGet key: ");
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Map.Entry<String, Integer> obj1 = null;

		for (Map.Entry<String, Integer> it : set) {

			if (it.getKey() == "henv")
				obj1 = it;

			System.out.println(it.getKey());
//		it.setValue(12321);
		}
		System.out.println("\nGet values: ");

		for (Map.Entry<String, Integer> entry : set) {

			if (entry.equals(obj1))
				System.out.println("ENtry: " + entry);

			System.out.println(entry.getValue());
		}
	}
}
