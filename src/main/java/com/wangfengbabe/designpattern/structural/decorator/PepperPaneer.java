package com.wangfengbabe.designpattern.structural.decorator;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class PepperPaneer extends Pizza {

  public PepperPaneer() {
    description = "PepperPaneer";
  }

  @Override
  public double getCost() {
    return 100;
  }
}
