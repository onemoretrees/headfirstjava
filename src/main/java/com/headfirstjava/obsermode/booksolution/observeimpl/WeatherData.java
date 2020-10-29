package com.headfirstjava.obsermode.booksolution.observeimpl;

import com.headfirstjava.obsermode.booksolution.observeinterface.Observer;
import com.headfirstjava.obsermode.booksolution.observeinterface.Subject;

import java.util.ArrayList;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public class WeatherData implements Subject {

    /**
     * 观察者
     */
    private ArrayList observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 压力
     */
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0;i < observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;

        measurementsChanged();
    }
}
