package com.patterns.design.adapter.outlet;

public class UsPlug implements Plug {

	@Override
	public void transfer() {
		System.out.println("Transfer power throug us plug");
	}

}
