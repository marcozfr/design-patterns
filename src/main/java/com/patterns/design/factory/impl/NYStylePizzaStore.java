package com.patterns.design.factory.impl;

import com.patterns.design.factory.Pizza;
import com.patterns.design.factory.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		NYPizzaIngredientFactory pizzaFactory= new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza(pizzaFactory);
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		return pizza;
	}
}
