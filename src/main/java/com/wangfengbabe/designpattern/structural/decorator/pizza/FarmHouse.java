package com.wangfengbabe.designpattern.structural.decorator.pizza;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class FarmHouse extends Pizza {

  @Override
  public double getCost() {
    return 200;
  }

  public FarmHouse() {
    description = "FarmHouse";
  }
}
