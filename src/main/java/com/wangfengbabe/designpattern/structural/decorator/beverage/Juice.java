package com.wangfengbabe.designpattern.structural.decorator.beverage;

public class Juice implements Beverage {

    private String name;
    private double price;

    public Juice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double cost() {
        return this.price;
    }

    @Override
    public String getDescrition() {
        return this.name;
    }
}
