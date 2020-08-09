package jav.study.fileinout;

import java.io.File;

public class FileLeng {
	public static void main(String[] args) {
		try {
//			File fil = new File("E:\\Download\\report2\\feck\\");
//			File[] files = fil.listFiles();
//			for (File file : files) {
//				if(file.getName() == "clgt.txt")
//				System.out.println("file name: "+ file.getName());
//				System.out.println("check file length: " + file.length());
//			}
			
			File fil = new File("E:\\Download\\report2\\feck\\clgt.txt");
			System.out.println("The length of string that exitted on the file: " +fil.length());
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
