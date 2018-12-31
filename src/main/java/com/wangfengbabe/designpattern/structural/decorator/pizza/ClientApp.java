package com.wangfengbabe.designpattern.structural.decorator.pizza;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    Pizza pizza = new Barbeque(new PepperPaneer());
    System.out.println(pizza.getDescription());
    System.out.println(pizza.getCost());

    pizza = new FreshTomato(new PepperPaneer());
    System.out.println(pizza.getDescription());
    System.out.println(pizza.getCost());

    pizza = new Barbeque(new FreshTomato(new PepperPaneer()));
    System.out.println(pizza.getDescription());
    System.out.println(pizza.getCost());

  }

}
