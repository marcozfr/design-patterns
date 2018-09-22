package com.patterns.design.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.patterns.design.observer.Observer;
import com.patterns.design.observer.Subject;

public class WeatherData implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private float temperature;
	private float humidity;
	private float pressure;

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

}
