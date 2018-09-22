package com.patterns.design.templatemethod;

import java.util.Collection;

public class Main {
	
	public static void main(String[] args) {
		CaffeineBeverage b = new TeaBeverageWithHook();
		b.prepare();
	}

}
