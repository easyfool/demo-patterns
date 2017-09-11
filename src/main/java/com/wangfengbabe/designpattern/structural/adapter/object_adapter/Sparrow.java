package com.wangfengbabe.designpattern.structural.adapter.object_adapter;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Sparrow implements Bird {


  @Override
  public void fly() {
    System.out.println("Flying");
  }

  @Override
  public void makesound() {
    System.out.println("chrip chrip chrip");
  }
}
