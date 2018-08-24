package io.weather;

import java.util.Observable;

import io.weather.display.CurrentConditionalDislay;
import io.weather.display.ForecastDisplay;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
	}
	
	public void measurementsChange() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChange();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionalDislay cDislay = new CurrentConditionalDislay(weatherData);
		ForecastDisplay fDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4F);
		weatherData.setMeasurements(82, 70, 29.2F);
		weatherData.setMeasurements(78, 90, 29.2F);
	}
	
	

}
