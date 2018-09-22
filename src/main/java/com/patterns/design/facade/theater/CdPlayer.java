package com.patterns.design.facade.theater;

public class CdPlayer {
	
	public void play() {
		System.out.println("Starts playing cd");
	}
	
	public void stop() {
		System.out.println("Stops playing cd");
	}
	
	public void removeCD() {
		System.out.println("Remove cd");
	}
	
	public void turnOff() {
		System.out.println("Turns cd player off");
	}
	
	public void turnOn() {
		System.out.println("Turns cd player on");
	}
}
