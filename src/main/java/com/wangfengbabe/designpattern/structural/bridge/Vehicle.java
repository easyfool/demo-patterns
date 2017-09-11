package com.wangfengbabe.designpattern.structural.bridge;

/**
 * Created by wangfeng on 11/09/2017.
 */
public abstract class Vehicle {

  protected Workshop workshop1;

  protected Workshop workshop2;

  public Vehicle(Workshop workshop1, Workshop workshop2) {
    this.workshop1 = workshop1;
    this.workshop2 = workshop2;
  }

  public abstract void manufacture();
}
