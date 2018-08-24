package io.weather.display;

import java.util.Observable;
import java.util.Observer;

import io.weather.WeatherData;

public class CurrentConditionalDislay implements Observer, DisplayElement{
	private Observable observable;
	private float temperature;
	private float humidity;
	public CurrentConditionalDislay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
	
}
