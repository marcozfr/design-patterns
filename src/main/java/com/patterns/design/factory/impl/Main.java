package com.patterns.design.factory.impl;

import com.patterns.design.factory.Pizza;

public class Main {
	
	public static void main(String[] args) {
		NYStylePizzaStore pizzaStore = new NYStylePizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
	}

}
