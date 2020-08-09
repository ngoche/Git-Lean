package jav.study.fileinout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlustTest {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		File file = new File("E:\\Download\\report2\\feck\\henv"+dateFormat.format(date)+".txt");
		try {
			if(file.createNewFile()) {

				OutputStream os = new FileOutputStream(file);
				InputStream is = new FileInputStream(file);
				os.write('A');
//				os.flush();
//				os.write('B');
//				os.flush();
				System.out.println(""+(char)is.read());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
