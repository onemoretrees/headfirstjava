package com.headfirstjava.obsermode.booksolution.observeimpl;

import com.headfirstjava.obsermode.booksolution.observeinterface.DisplayElement;

/**
 * @author: liuyuhang
 * @date: 2020/10/30
 */
public class ForecastDisplay implements DisplayElement {

    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }



    @Override
    public void display() {

    }
}
