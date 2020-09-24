package com.patterns.design.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.patterns.design.iterator.ItemIterator;
import com.patterns.design.iterator.ItemList;

public class DessertList<T> implements ItemList<T> {
	
	List<T> array = new ArrayList<>();

	@Override
	public void add(T t) {
		array.add(t);
	}

	@Override
	public void remove(int index) {
		array.remove(index);
	}

	@Override
	public ItemIterator<T> iterator() {
		return new ItemIterator<T>() {
			
			private Iterator iterator = array.iterator();

			@Override
			public boolean hasNext() {
				return iterator.hasNext();
			}

			@Override
			public T next() {
				return (T)iterator.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
}
