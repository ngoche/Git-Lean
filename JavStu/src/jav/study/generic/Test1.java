package jav.study.generic;

public class Test1 {
	private static <T> void printArray(T[] array) {
		for (T e : array) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Integer Array: ");
		printArray(intArray);

	}
}
