package jav.study.generic;

public class FindMax {
	private static <T extends Comparable<T>> void findMax(T...t) {

		T max = t[0];
		
		for (int i = 0; i < t.length; i ++) {
			if(t[i].compareTo(max) > 0 )
				max = t[i];
			
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		FindMax.findMax(5,2,6,3,8,9,0,4,5,2);
	}
}