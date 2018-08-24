package io.weather.display;

import java.util.Observable;
import java.util.Observer;

import io.weather.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer{
	private Observable observable;
	private float currentPressure = 29.2F;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
		
	}
	
	
}
