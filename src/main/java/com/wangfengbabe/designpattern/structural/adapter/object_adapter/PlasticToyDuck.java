package com.wangfengbabe.designpattern.structural.adapter.object_adapter;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class PlasticToyDuck implements ToyDuck {


  @Override
  public void squeak() {
    System.out.println("Squeak");
  }
}
