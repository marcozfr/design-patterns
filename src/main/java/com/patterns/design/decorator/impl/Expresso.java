package com.patterns.design.decorator.impl;

import com.patterns.design.decorator.Beverage;

public class Expresso extends Beverage {
	
	public Expresso() {
		description = "Expresso";
	}

	@Override
	public double cost() {
		return 4.99;
	}

}
