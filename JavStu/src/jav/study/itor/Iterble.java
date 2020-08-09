package jav.study.itor;

import java.util.Iterator;

public class Iterble implements Iterable<Iterble>{

	@Override
	public Iterator<Iterble> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Itertor implements Iterator<Iterator<String>>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
