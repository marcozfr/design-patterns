package com.patterns.design.adapter.outlet;

public class USPlugAdapter extends UsPlug {
	
	StandardACPlug endpoint;
	
	public USPlugAdapter(StandardACPlug endpoint) {
		this.endpoint = endpoint;
	}

	@Override
	public void transfer() {
		System.out.println("Transfering power through bridge");
		this.endpoint.transfer();
	}

}
