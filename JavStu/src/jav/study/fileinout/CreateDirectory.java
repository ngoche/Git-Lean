package jav.study.fileinout;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
	public static void main(String[] args) {
		Path path = Paths.get("E:\\Download\\report2\\feck\\smt");
		if(!Files.exists(path))
			try {
				Files.createDirectories(path);
				System.out.println("path " + path  + " created!!!");
			} catch (IOException e) {
				// TODO: handle exception
			}
	}
}
