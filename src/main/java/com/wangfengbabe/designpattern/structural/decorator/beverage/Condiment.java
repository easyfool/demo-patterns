package com.wangfengbabe.designpattern.structural.decorator.beverage;

import lombok.Data;

@Data
public class Condiment implements Beverage {

    private String name;

    private double price;

    private Beverage beverage;

    public Condiment(String name, double price,
            Beverage beverage) {
        this.name = name;
        this.price = price;
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.price + this.beverage.cost();

    }

    @Override
    public String getDescrition() {
        return this.name + " " + this.beverage.getDescrition();
    }
}
