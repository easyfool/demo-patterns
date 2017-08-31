package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 * provide the option for exception handling
 */
public class StaticBlockInitializationSingleton {

  private static StaticBlockInitializationSingleton instance;

  private StaticBlockInitializationSingleton() {

  }

  //provide the option for exception handling
  static {
    try {
      instance = new StaticBlockInitializationSingleton();
    } catch (Throwable e) {
      throw new RuntimeException(e);
    }
  }

  public static StaticBlockInitializationSingleton getInstance() {
    return instance;
  }

}
