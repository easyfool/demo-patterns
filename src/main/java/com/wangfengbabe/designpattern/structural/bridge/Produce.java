package com.wangfengbabe.designpattern.structural.bridge;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Produce implements Workshop {

  @Override
  public void work() {
    System.out.print("Produced ");
  }
}
