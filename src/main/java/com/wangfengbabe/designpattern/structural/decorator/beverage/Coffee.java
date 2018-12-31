package com.wangfengbabe.designpattern.structural.decorator.beverage;

import lombok.Data;

@Data
public class Coffee implements Beverage {

    private String name;
    private double price;

    public Coffee(String name, double price) {
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
