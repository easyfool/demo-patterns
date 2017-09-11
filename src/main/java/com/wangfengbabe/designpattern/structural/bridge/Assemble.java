package com.wangfengbabe.designpattern.structural.bridge;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Assemble implements Workshop {

  @Override
  public void work() {
    System.out.print(" And");
    System.out.println(" Assembled.");
  }
}
