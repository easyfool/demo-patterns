package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class EagerInitializationSingleton {

  private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

  private EagerInitializationSingleton() {
    System.out.println("EagerInitializationSingleton private constructor ");
  }

  public static EagerInitializationSingleton getInstance() {
    return instance;
  }

}
