package com.patterns.design.iterator;

public interface ItemList<T> {
	
	public void add(T t);
	
	public void remove(int index);
	
	public ItemIterator<T> iterator();

}
