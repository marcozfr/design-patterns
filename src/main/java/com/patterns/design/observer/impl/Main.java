package com.patterns.design.observer.impl;

public class Main {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		
		CurrentConditionsDisplay display = new CurrentConditionsDisplay();
		weatherData.registerObserver(display);
		
		weatherData.setMeasurements(0.43f, .434f, .10012f);
	}
}
