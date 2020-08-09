package jav.study.fileinout;

import java.io.File;

public class FilList {
	public static void main(String[] args) {
		File file = null;
		String[] path;
		try {
			file = new File("E:\\Download\\report2\\feck\\");
			path = file.list();
			for (String p : path) {
				System.out.println("checkpath: " + p);
			}
		} catch (SecurityException e) {
			// TODO: handle exception
		}
	}
}
