package com.patterns.design.iterator;

public interface ItemIterator <T> {
	
	boolean hasNext();
	
	T next();
	
	void remove();

}
