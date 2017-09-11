package com.wangfengbabe.designpattern.structural.decorator;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Barbeque extends ToppingDecorator {

  Pizza pizza;

  @Override
  public String getDescription() {
    return pizza.getDescription() + " with " + "Barbeque";
  }

  public void setPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  public Barbeque(Pizza pizza) {

    this.pizza = pizza;
  }

  @Override
  public double getCost() {
    return 60 + pizza.getCost();
  }
}
