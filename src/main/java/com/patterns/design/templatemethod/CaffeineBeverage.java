package com.patterns.design.templatemethod;

public abstract class CaffeineBeverage {

	final void prepare() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {	
		// implementation
	}

	void pourInCup() {
		// implementation
	}
	
	public boolean customerWantsCondiments() {
		return false;
	}
}
