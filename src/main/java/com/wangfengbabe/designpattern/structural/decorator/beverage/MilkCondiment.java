package com.wangfengbabe.designpattern.structural.decorator.beverage;

public class MilkCondiment extends Condiment {

    public MilkCondiment(String name, double price,
            Beverage beverage) {
        super(name, price, beverage);
    }
}
