package jav.study.generic;

public class MapGene<K, V> {
	K obj1;
	V obj2;

	public MapGene(K obj1, V obj2) {
//		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	private void print() {
		System.out.println("K-Obj1: " + this.obj1);
		System.out.println("V-Obj1: " + this.obj2);

	}

	public static void main(String[] args) {
		MapGene<String, Integer> map = new MapGene<String, Integer>("Henv", 27);
		map.print();
	}

}
