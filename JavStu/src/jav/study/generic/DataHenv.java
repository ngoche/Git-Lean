package jav.study.generic;

import java.util.ArrayList;
import java.util.List;

public class DataHenv<C> {
	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public static void main(String[] args) {
		POJO p = new POJO("henv", 23423);
		DataHenv<POJO> dt = new DataHenv<POJO>();
		dt.setC(p);
		System.out.println(dt.getC().getName());
	}
}
