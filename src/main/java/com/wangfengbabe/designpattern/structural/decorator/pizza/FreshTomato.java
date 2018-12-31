package com.wangfengbabe.designpattern.structural.decorator.pizza;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class FreshTomato extends ToppingDecorator {

  public void setPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  public FreshTomato(Pizza pizza) {

    this.pizza = pizza;
  }

  Pizza pizza;

  @Override
  public String getDescription() {
    return pizza.getDescription() + "with " + "FreshTomato";
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 40;
  }
}
