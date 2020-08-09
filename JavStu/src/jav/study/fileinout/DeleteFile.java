package jav.study.fileinout;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File fil = null;
		try {
			fil = new File("E:\\logs");
			if (deleteFiles(fil)) {
				System.out.println("He dep trai");
			} else {
				System.out.println("Not thing happended");
			}
		} catch (SecurityException e) {
			// TODO: handle exception
		}
	}

	private static boolean deleteFiles(File fileDirectiory) {
		boolean checksuccess = true;
		if (fileDirectiory.isDirectory()) {
			String[] lstFile = fileDirectiory.list();
			for (String file : lstFile) {
				checksuccess = deleteFiles(new File(fileDirectiory, file));
				if (!checksuccess)
					return false;
			}
		}
		return fileDirectiory.delete();
	}
}
