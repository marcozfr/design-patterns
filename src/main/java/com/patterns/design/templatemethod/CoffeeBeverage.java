package com.patterns.design.templatemethod;

public class CoffeeBeverage extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Brew specific to coffee");
	}

	@Override
	void addCondiments() {
		System.out.println("Add condiments, like cream or milk");
	}

}
