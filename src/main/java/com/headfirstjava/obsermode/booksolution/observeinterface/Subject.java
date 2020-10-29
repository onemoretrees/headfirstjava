package com.headfirstjava.obsermode.booksolution.observeinterface;

/**
 * @author: liuyuhang
 * @date: 2020/10/29
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
