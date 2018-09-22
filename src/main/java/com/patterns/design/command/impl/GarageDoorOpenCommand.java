package com.patterns.design.command.impl;

import com.patterns.design.command.Command;

public class GarageDoorOpenCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Just open the garage door.");
	}

}
