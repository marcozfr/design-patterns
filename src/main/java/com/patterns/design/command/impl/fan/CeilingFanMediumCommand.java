package com.patterns.design.command.impl.fan;

import com.patterns.design.command.Command;

public class CeilingFanMediumCommand extends CeilingFanCommand implements Command {
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		super.ceilingFan = ceilingFan;
	}

	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	
}