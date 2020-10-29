package com.headfirstjava.obsermode.booksolution.observeimpl;

import com.headfirstjava.obsermode.booksolution.observeinterface.DisplayElement;
import com.headfirstjava.obsermode.booksolution.observeinterface.Observer;
import com.headfirstjava.obsermode.booksolution.observeinterface.Subject;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
