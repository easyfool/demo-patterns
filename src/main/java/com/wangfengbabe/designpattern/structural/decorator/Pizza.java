package com.wangfengbabe.designpattern.structural.decorator;

/**
 * Created by wangfeng on 11/09/2017.
 * Java program to demonstrate Decorator pattern
 * Abstract pizza class
 */
public abstract class Pizza {

  String description = "Unknown pizza";

  public String getDescription() {
    return description;
  }

  public abstract double getCost();

}
