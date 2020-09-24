package com.patterns.design.templatemethod;

public class Main {
	
	public static void main(String[] args) {
		CaffeineBeverage b = new TeaBeverageWithHook();
		b.prepare();
	}

}
