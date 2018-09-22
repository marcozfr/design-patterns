package com.patterns.design.templatemethod;

public class TeaBeverage extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Brew herbs for tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Add condiments, like.. ?");
	}

}
