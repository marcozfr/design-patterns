package com.patterns.design.factory.impl;

import com.patterns.design.factory.Cheese;
import com.patterns.design.factory.Pepperoni;
import com.patterns.design.factory.Pizza;
import com.patterns.design.factory.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Prepare ny style cheese pizza");
		Cheese cheese = ingredientFactory.createCheese();
		System.out.println("With cheese : " + cheese);
		Pepperoni pepperoni = ingredientFactory.createPepperoni();
		System.out.println("With pepperoni : " + pepperoni);	
	}

	@Override
	public void bake() {
		System.out.println("Bake ny style cheese pizza");	
	}

	@Override
	public void cut() {
		System.out.println("Cut ny style cheese pizza in 8 slices");	
	}

	@Override
	public void box() {
		System.out.println("Box ny style cheese pizza");	
	}

}
