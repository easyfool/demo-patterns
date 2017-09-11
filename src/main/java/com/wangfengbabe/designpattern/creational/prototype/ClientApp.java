package com.wangfengbabe.designpattern.creational.prototype;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    ColorStore.getColor("blue").addColor();
    ColorStore.getColor("black").addColor();
    ColorStore.getColor("black").addColor();
    ColorStore.getColor("blue").addColor();
  }

}
