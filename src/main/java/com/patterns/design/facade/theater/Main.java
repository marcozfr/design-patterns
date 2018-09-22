package com.patterns.design.facade.theater;

public class Main {
	
	public static void main(String[] args) {
		CdPlayer cdplayer = new CdPlayer();
		PopcornPopper popper = new PopcornPopper();
		Screen screen = new Screen();
		HomeTheaterFacade facade = new HomeTheaterFacade(cdplayer, popper, screen);
		facade.watchMovie();
		facade.endMovie();
	}

}
