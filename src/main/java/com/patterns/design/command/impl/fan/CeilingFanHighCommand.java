package com.patterns.design.command.impl.fan;

import com.patterns.design.command.Command;

public class CeilingFanHighCommand extends CeilingFanCommand implements Command {
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super.ceilingFan  = ceilingFan;
	}

	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	
}