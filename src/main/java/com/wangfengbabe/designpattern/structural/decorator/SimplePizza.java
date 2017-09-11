package com.wangfengbabe.designpattern.structural.decorator;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class SimplePizza extends Pizza {


  public SimplePizza() {
    description = "Simple Pizza";
  }

  @Override
  public double getCost() {
    return 50;
  }
}
