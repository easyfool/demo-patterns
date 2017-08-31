package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class ThreadSafeSingleton1 {

  private static ThreadSafeSingleton1 instance;

  private ThreadSafeSingleton1() {

  }

  public synchronized ThreadSafeSingleton1 getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton1();
    }
    return instance;
  }

}
