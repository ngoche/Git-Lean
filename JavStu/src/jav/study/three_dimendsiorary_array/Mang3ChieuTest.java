package jav.study.three_dimendsiorary_array;

public class Mang3ChieuTest {
	public static void main(String[] args) {
		String x[][][] = new String[4][4][4];
		for (int i = 0; i < 1; i++)
			for (int j = 0; j < 2; j++)
				for (int k = 0; k < 3; k++)
					x[i][j][k] = String.valueOf(k);
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++)
					System.out.print("x[" + i + "][" + j + "][" + k + "] :" + x[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
	}
}
