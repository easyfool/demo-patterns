package com.wangfengbabe.designpattern.structural.observer;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class StockSubject implements Subject {

    private Date date;

    private double openPrice;

    private double maxPrice;

    private double minPrice;

    private double closePrice;

    private List<Observer> observers;

    public StockSubject() {
        this.observers = new ArrayList<>();
    }

    public StockSubject(List<Observer> observers) {
        observers = new ArrayList<>();
        this.observers = observers;
    }

    @Override
    public boolean registerObservers(List<Observer> observers) {
        return this.observers.addAll(observers);
    }

    @Override
    public boolean removeObservers(List<Observer> observers) {
        return this.observers.removeAll(observers);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.udpate(this);
        }

    }

    public void profitEarn() {
        this.closePrice += 20;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "StockSubject{" +
                "date=" + date +
                ", openPrice=" + openPrice +
                ", maxPrice=" + maxPrice +
                ", minPrice=" + minPrice +
                ", closePrice=" + closePrice +
                ", observers=" + observers +
                '}';
    }
}
