package com.headfirstjava.obsermode.solution1.observiimpl;

import com.headfirstjava.obsermode.solution1.observeinterface.Huairen;
import com.headfirstjava.obsermode.solution1.observeinterface.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public class XianFan1 implements Huairen {

    private String name = "大熊";

    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notice(String message) {
        for(Observer observer:observerList){
            observer.update(message,name);
        }
    }
}
