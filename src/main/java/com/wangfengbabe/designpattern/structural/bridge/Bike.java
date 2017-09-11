package com.wangfengbabe.designpattern.structural.bridge;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Bike extends Vehicle {

  public Bike(Workshop workshop1, Workshop workshop2) {
    super(workshop1, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.print("Bike ");
    workshop1.work();
    workshop2.work();
  }
}
