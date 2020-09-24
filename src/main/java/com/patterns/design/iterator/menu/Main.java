package com.patterns.design.iterator.menu;

import com.patterns.design.iterator.ItemIterator;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Main Menu");
		System.out.println("---------");
		MenuList<String> menuList = new MenuList<>();
		menuList.add("Soap");
		menuList.add("Cream");
		menuList.add("Lobster");
		menuList.add("Grilled fish");
		menuList.remove(1);
		ItemIterator<String> items = menuList.iterator();
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		
		System.out.println("");
		System.out.println("Dessert");
		System.out.println("-------");
		
		DessertList<String> dessertList = new DessertList<>();
		dessertList.add("Icecream");
		
		ItemIterator<String> dessertItems = dessertList.iterator();
		while(dessertItems.hasNext()) {
			System.out.println(dessertItems.next());
		}
	}

}
