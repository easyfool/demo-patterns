package com.wangfengbabe.designpattern.structural.decorator.beverage;

public class Test {

    public static void main(String[] args) {
        Beverage coffee = new Coffee("cuppccimo coffee", 20);
        Beverage milkCoffee = new MilkCondiment("milk", 5, coffee);
        System.out.println(milkCoffee);
        System.out.println(milkCoffee.getDescrition() + ","+milkCoffee.cost());

    }

}
