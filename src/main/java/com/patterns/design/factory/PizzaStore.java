package com.patterns.design.factory;

public abstract class PizzaStore {
	
	//SimplePizzaFactory pizzaFactory;

	public Pizza orderPizza(String type) {
		Pizza pizza;
		// pizza = pizzaFactory.createPizza(type);
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
	
}
