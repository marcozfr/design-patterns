package com.patterns.design.observer.impl;

import com.patterns.design.observer.Observer;

public class CurrentConditionsDisplay implements Observer {

	public void update(float temp, float humidity, float pressure) {
		System.out.printf("Current conditions::: Temp: %f Humidity: %f Pressure: %f", temp, humidity, pressure);
	}

}
