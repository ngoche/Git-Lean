package jav.study.relf;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	public static Date parse(String str, String format) {
		DateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(str);
		} catch (ParseException e) {
			return new Date();
		}
	}
}
