package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class DoubleCheckLockingThreadSafeSingleton {

  private static DoubleCheckLockingThreadSafeSingleton instance;

  private DoubleCheckLockingThreadSafeSingleton() {

  }

  public static DoubleCheckLockingThreadSafeSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckLockingThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new DoubleCheckLockingThreadSafeSingleton();
        }

      }
    }
    return instance;
  }

}
