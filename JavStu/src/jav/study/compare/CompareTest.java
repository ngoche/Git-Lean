package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {
	public static void main(String[] args) {
		/**
		 * Student st = new Student(); Student st2 = new Student(); st.setScore(11);
		 * st2.setScore(11);
		 * System.out.println((st.getScore()).compareTo(st2.getScore()));
		 **/
		List<Student> lstStudent = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student st = new Student();
			st.setScore(i + 10);
			lstStudent.add(st);
		}
		Collections.sort(lstStudent);
		for (Student student : lstStudent) {
			System.out.println(student.getScore());
		}
	}
}

class Student implements Comparable<Student> {
	private String name;
	private Integer score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		if (score == o.getScore())
			return -1;
		else if (score > o.getScore())
			return 0;
		return 1;
	}

}