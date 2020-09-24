package com.patterns.design.iterator.menu;

import com.patterns.design.iterator.ItemIterator;
import com.patterns.design.iterator.ItemList;

public class MenuList<T> implements ItemList<T> {
	
	private static final int MAX_LENGTH = 10;
	
	private T[] array;
	private int count = 0;
	
	@SuppressWarnings("unchecked")
	public MenuList() {
		array = (T[])new Object[MAX_LENGTH];
	}
	
	public ItemIterator<T> iterator() {
		return new ItemIterator<T>() {
			
			private int itecount  = 0;

			@Override
			public boolean hasNext() {
				return itecount < count;
			}

			@Override
			public T next() {
				return array[itecount++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public void add(T t) {
		if(count == array.length) {
			return;
		}
		array[count++] = t; 
	}
	
	public void remove(int index) {
		array[index] = null; 
		for (int i = index; i < count-1; i++) {
			array[i] = array[i+1];
		}
		count--;
	}

}
