package com.patterns.design.adapter.outlet;

public class Main {
	
	public static void main(String[] args) {
		UsPowerOutlet outlet = new UsPowerOutlet();
		UsPlug plug = new USPlugAdapter(new StandardACPlug());
		outlet.receive(plug);
	}

}
