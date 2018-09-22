package com.patterns.design.command.impl.light;

import com.patterns.design.command.Command;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
