package com.patterns.design.decorator.impl;

public class MainCoffeeShop {
	
	public static void main(String[] args) {
		Expresso expresso = new Expresso();
		Mocha mocha = new Mocha(expresso);
		System.out.printf("Beverage: %s. Total amount: %f",mocha.getDescription(), mocha.cost());
		System.out.println();
		
		HouseBlend houseBlend = new HouseBlend();
		Mocha mocha1 = new Mocha(houseBlend);
		System.out.printf("Beverage: %s. Total amount: %f",mocha1.getDescription(), mocha1.cost());
		System.out.println();
	}

}
