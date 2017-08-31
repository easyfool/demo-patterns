package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class ThreadSageSingleton2 {

  private static ThreadSageSingleton2 instance;

  private ThreadSageSingleton2() {

  }

  public static ThreadSageSingleton2 getInstance() {
    if (instance == null) {
      synchronized (ThreadSageSingleton2.class) {
        instance = new ThreadSageSingleton2();
      }
    }
    return instance;
  }

}
