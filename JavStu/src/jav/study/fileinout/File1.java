package jav.study.fileinout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		FileInputStream fis = new FileInputStream(file);
		int c = fis.read();
		while (c != -1) {
			System.out.println((char) c);
			c = fis.read();
		}

		fis.close();

	}
}
