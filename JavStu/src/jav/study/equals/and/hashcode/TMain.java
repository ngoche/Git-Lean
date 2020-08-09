package jav.study.equals.and.hashcode;

public class TMain {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		TMain t = new TMain();
		t.setId(1);

		TMain t2 = new TMain();
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());

		t2.setId(1);
		System.out.println(t == t2);
	}

	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof TMain)
			if (((TMain) var1).getId() == this.id)
				return true;
		return false;
	}

	@Override
	public int hashCode() {
		return 100000;
	}
}
