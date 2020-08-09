package jav.study.fileinout;

import java.io.File;

public class TestMdik {
	public static void main(String[] args) {
		File file = null;
		try {
			file = new File("E:\\Download\\report2\\feck\\testMdik.txt");
			boolean checkOk = file.mkdir();
			System.out.println("henv check mkdir:" + checkOk);
		} catch (SecurityException e) {
			// TODO: handle exception
		}
	}
}
