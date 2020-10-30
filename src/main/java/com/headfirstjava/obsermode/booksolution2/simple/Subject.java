package com.headfirstjava.obsermode.booksolution2.simple;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
