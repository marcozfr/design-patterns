package com.patterns.design.command.impl;

import com.patterns.design.command.Command;
import com.patterns.design.command.NoCommand;
import com.patterns.design.command.impl.fan.CeilingFan;
import com.patterns.design.command.impl.fan.CeilingFanHighCommand;
import com.patterns.design.command.impl.fan.CeilingFanOffCommand;
import com.patterns.design.command.impl.light.Light;
import com.patterns.design.command.impl.light.LightOffCommand;
import com.patterns.design.command.impl.light.LightOnCommand;

public class ComposedRemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public ComposedRemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undo() {
		undoCommand.execute();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " "
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
	
	public static void main(String[] args) {
		ComposedRemoteControl remoteControl = new ComposedRemoteControl();
		Light livingRoomLight = new Light();
		Light kitchenLight = new Light();
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		remoteControl.onButtonWasPushed(0);
		
		remoteControl.offButtonWasPushed(0);
		
		CeilingFan fan = new CeilingFan("2nd floor fan");
		CeilingFanHighCommand fanhighCommand = new CeilingFanHighCommand(fan);
		CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(fan);
		
		remoteControl.setCommand(2, fanhighCommand, fanOffCommand);
		
		remoteControl.onButtonWasPushed(2);
		
		remoteControl.undo();
		 
	}

}
