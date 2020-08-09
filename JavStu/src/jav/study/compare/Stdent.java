package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stdent implements Comparable<Stdent> {
	private String name;
	private int score;

	@Override
	public int compareTo(Stdent o) {
		if (score == o.score)
			return 0;
		else if (score < o.score)
			return 1;
		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + " score: " + this.score;
	}

	public static void main(String[] args) {
		List<Stdent> lstSt = new ArrayList<Stdent>();
		Stdent st = new Stdent();
		st.score = 10;
		st.name = "AAAA";

		Stdent st2 = new Stdent();
		st2.score = 112;
		st2.name = "EEEE";

		Stdent st3 = new Stdent();
		st3.score = 14;
		st3.name = "BBBB";

		Stdent st4 = new Stdent();
		st4.score = 105;
		st4.name = "DDBD";

		Stdent st5 = new Stdent();
		st5.score = 101;
		st5.name = "HHHH";

		Stdent st6 = new Stdent();
		st6.score = 102;
		st6.name = "RRRR";
		lstSt.add(st);
		lstSt.add(st2);
		lstSt.add(st3);
		lstSt.add(st4);
		lstSt.add(st5);
		lstSt.add(st6);
		Collections.sort(lstSt);
//		lstSt.forEach(std -> System.out.println(std.toString()));
		lstSt.forEach(System.out::println);
	}
}
