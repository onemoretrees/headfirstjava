package com.headfirstjava.obsermode.booksolution2.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
