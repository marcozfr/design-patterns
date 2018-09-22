package com.patterns.design.factory.impl;

import com.patterns.design.factory.Cheese;
import com.patterns.design.factory.Pepperoni;
import com.patterns.design.factory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Cheese createCheese() {
		return new Cheese();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}

}
