package jav.study.fileinout;

import java.io.File;

public class ListFileTest {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\\\Download\\\\report2\\\\feck\\\\");
			
			File[] files = file.listFiles();
			for(int i = 0 ; i< files.length; i ++) {
				System.out.println(files[i].getAbsolutePath());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
