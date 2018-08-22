package io.weather.elements;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
