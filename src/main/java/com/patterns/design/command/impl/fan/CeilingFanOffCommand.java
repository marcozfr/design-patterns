package com.patterns.design.command.impl.fan;

import com.patterns.design.command.Command;

public class CeilingFanOffCommand extends CeilingFanCommand implements Command {
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super.ceilingFan = ceilingFan;
	}

	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	
}