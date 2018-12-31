package com.wangfengbabe.designpattern.structural.decorator.beverage;

public class SugarCondiment extends Condiment {

    public SugarCondiment(String name, double price,
            Beverage beverage) {
        super(name, price, beverage);
    }
}
