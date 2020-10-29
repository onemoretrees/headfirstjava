package com.headfirstjava.obsermode.booksolution.test;

import com.headfirstjava.obsermode.booksolution.observeimpl.CurrentConditionsDisplay;
import com.headfirstjava.obsermode.booksolution.observeimpl.WeatherData;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public class WeatherStation {


    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }


}
