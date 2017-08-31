package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class LazyInitializationSingleton {

  private static LazyInitializationSingleton instance;

  private LazyInitializationSingleton() {

  }

  public static LazyInitializationSingleton getInstance() {
    if (instance == null) {
      instance = new LazyInitializationSingleton();
    }
    return instance;
  }

}
