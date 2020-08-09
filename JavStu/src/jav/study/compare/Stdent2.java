package jav.study.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import jav.study.compare.Person.AgeComparator;

public class Stdent2 extends PStdent{
	/*private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static class CompareSorting implements Comparator<Stdent2> {
		@Override
		public int compare(Stdent2 o1, Stdent2 o2) {
			int nameCompare = o1.getName().compareTo(o2.getName());
			String o1age = String.valueOf(o1.getAge());
			String o2age = String.valueOf(o2.getAge());
			int ageCompare = o1age.compareTo(o2age);
			if (nameCompare == 0)
				return ageCompare == 0 ? nameCompare : ageCompare;
			return nameCompare;

		}

	}

	public static void main(String[] args) {
		Stdent2 st2 = new Stdent2();
		st2.name = "DEDF";
		st2.age = 210832;

		Stdent2 st21 = new Stdent2();
		st21.name = "asdfDEDF";
		st21.age = 216432;

		Stdent2 st22 = new Stdent2();
		st22.name = "jjytEDF";
		st22.age = 287132;

		Stdent2 st23 = new Stdent2();
		st23.name = "awertryDEDF";
		st23.age = 213232;

		Stdent2 st24 = new Stdent2();
		st24.name = "asdfDEDF";
		st24.age = 213342;

		Stdent2 st25 = new Stdent2();
		st25.name = "ghDEDF";
		st25.age = 234132;

		Stdent2 st26 = new Stdent2();
		st26.name = "jjDEDF";
		st26.age = 2133432;
		List<Stdent2> lstSt = new ArrayList<Stdent2>();
		lstSt.add(st21);
		lstSt.add(st22);
		lstSt.add(st23);
		lstSt.add(st24);
		lstSt.add(st25);
		lstSt.add(st26);
		Iterator<Stdent2> itor = lstSt.iterator();
		System.out.println("After sorting");
		while (itor.hasNext())
			System.out.println(itor.next().toString());
//		itor.forEachRemaining(st -> System.out.println(st.toString()));//lambda nay chay binh thuong
		System.out.println("Before sort: ");

		Collections.sort(lstSt, new CompareSorting());
		lstSt.forEach(st -> System.out.println(st.toString()));
	}

	@Override
	public String toString() {

		return "Name: " + this.name + ", Age: " + this.age;
	}
*/
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Name: " + this.name + "; age: " + this.age;
	}
	/* test global variable (duplicate variable)
	public static void run() {
		String name = "ccccccccccc";
		System.out.println(name);
	}*/
	static class CompareMachine implements Comparator<Stdent2>{

		@Override
		public int compare(Stdent2 o1, Stdent2 o2) {
			int nameCpare = o1.name.compareTo(o2.name);
			String age1 = String.valueOf(o1.age);
			String age2 = String.valueOf(o2.age);
			int ageCpare = age1.compareTo(age2);
			if(nameCpare == 0 )
				return ageCpare == 0 ? nameCpare : ageCpare;
			return nameCpare;
		}
		
	}
	public static void main(String[] args) {
		Stdent2 st ;
		
		List<Stdent2> lstS = new ArrayList<Stdent2>();
		
		st = new Stdent2();
		st.name = "D";
		st.age = 15;
		lstS.add(st);

		st = new Stdent2();
		st.name = "E";
		st.age = 31;
		lstS.add(st);

		st = new Stdent2();
		st.name = "R";
		st.age = 61;
		lstS.add(st);

		st = new Stdent2();
		st.name = "E";
		st.age = 11;
		lstS.add(st);
		
		System.out.println("Before sort: ");
		Iterator<Stdent2> lstItor = lstS.iterator();
		lstItor.forEachRemaining(stTemp -> System.out.println(stTemp.toString()));
		System.out.println("After sort: ");
		Collections.sort(lstS, new Stdent2.CompareMachine());
		lstS.forEach(stTemp -> System.out.println(stTemp.toString()));
	}
}

class PStdent{
	String school;
}