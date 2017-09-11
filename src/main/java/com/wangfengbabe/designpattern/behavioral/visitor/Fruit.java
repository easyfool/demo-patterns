package com.wangfengbabe.designpattern.behavioral.visitor;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Fruit implements ItemElement {

  private int pricePerKg;
  private int weight;
  private String name;

  public Fruit(int pricePerKg, int weight, String name) {
    this.pricePerKg = pricePerKg;
    this.weight = weight;
    this.name = name;
  }

  public int getPricePerKg() {
    return pricePerKg;
  }

  public int getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
