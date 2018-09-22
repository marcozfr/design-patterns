package com.patterns.design.command.impl;

import com.patterns.design.command.Command;
import com.patterns.design.command.impl.light.Light;
import com.patterns.design.command.impl.light.LightOnCommand;

public class SimpleRemoteControl {

	Command slot;

	public SimpleRemoteControl() {
		
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
	
	
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpenCommand = new GarageDoorOpenCommand();
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpenCommand);
		remote.buttonWasPressed();
	}

}
