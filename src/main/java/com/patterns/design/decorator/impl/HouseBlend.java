package com.patterns.design.decorator.impl;

import com.patterns.design.decorator.Beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House blend";
	}

	@Override
	public double cost() {
		return 5.99;
	}

}
