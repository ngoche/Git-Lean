package jav.study.fileinout;

import java.io.File;

public class FileStartWithTest {
	public static void main(String[] args) {
		try {
			java.io.File file = new java.io.File("E:\\Download\\report2\\feck\\");
			java.io.FilenameFilter filter = new java.io.FilenameFilter() {
				@Override
				public boolean accept(java.io.File f, String name) {
					return name.startsWith("t");
				}

			};
			File[] files = file.listFiles(filter);
			for (File file2 : files) {
				System.out.println(file2.getName());
			}

		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
