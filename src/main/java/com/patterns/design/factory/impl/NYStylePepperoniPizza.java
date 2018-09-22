package com.patterns.design.factory.impl;

import com.patterns.design.factory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare ny style pepperoni pizza ");	
	}

	@Override
	public void bake() {
		System.out.println("Bake ny style pepperoni pizza ");
	}

	@Override
	public void cut() {
		System.out.println("Cut ny style pepperoni pizza ");
	}

	@Override
	public void box() {
		System.out.println("Box ny style pepperoni pizza ");
	}

}
