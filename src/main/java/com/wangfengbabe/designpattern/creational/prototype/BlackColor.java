package com.wangfengbabe.designpattern.creational.prototype;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class BlackColor extends Color {

  public BlackColor() {
    this.colorName = "black";
  }

  @Override
  void addColor() {
    System.out.println("black color added");
  }
}
