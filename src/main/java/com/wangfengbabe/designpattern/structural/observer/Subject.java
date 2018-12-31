package com.wangfengbabe.designpattern.structural.observer;

import java.util.List;

public interface Subject {

    boolean registerObservers(List<Observer> observers);

    boolean removeObservers(List<Observer> observers);

    void notifyObservers();


}
