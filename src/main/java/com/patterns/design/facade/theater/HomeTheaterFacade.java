package com.patterns.design.facade.theater;

public class HomeTheaterFacade {
	
	private CdPlayer cdplayer;
	private PopcornPopper popper;
	private Screen screen;
	
	public HomeTheaterFacade(CdPlayer cdplayer, PopcornPopper popper, Screen screen) {
		super();
		this.cdplayer = cdplayer;
		this.popper = popper;
		this.screen = screen;
	}
	
	public void watchMovie() {
		popper.pop();
		cdplayer.turnOn();
		screen.wideScreenOn();
		cdplayer.play();
	}
	
	public void endMovie() {
		cdplayer.removeCD();
		cdplayer.turnOff();
	}
	

}
