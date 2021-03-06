package com.patterns.design.command.impl.fan;

public abstract class CeilingFanCommand {
	
	protected CeilingFan ceilingFan;
	protected int prevSpeed;
	
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
	
	public abstract void execute();

}
