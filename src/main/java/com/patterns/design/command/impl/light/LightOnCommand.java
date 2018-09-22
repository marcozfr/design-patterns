package com.patterns.design.command.impl.light;

import com.patterns.design.command.Command;

public class LightOnCommand implements Command {
	
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}