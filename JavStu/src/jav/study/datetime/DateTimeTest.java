package jav.study.datetime;

import java.util.Calendar;

public class DateTimeTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -1);
		calendar.add(Calendar.DATE, -1);
		System.out.println(calendar.getTime());
	}
}
