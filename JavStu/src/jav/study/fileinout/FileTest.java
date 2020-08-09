package jav.study.fileinout;

import java.io.File;
import java.net.URI;

public class FileTest {
	public static void main(String[] args) {
		String pathName = "D:\\Download\\someDownload.txt";
		File file = new File(pathName);
		URI uir = file.toURI();
		System.out.println(uir.toString());
		
	}
}
