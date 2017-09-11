package com.wangfengbabe.designpattern.creational.prototype;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class BlueColor extends Color {

  public BlueColor() {
    this.colorName = "blue";
  }

  @Override
  void addColor() {
    System.out.println("blue color added");
  }
}
