package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class BillPushSingleton {

  private BillPushSingleton() {

  }

  private static class SingletonHelper {

    private static final BillPushSingleton SINGLETON = new BillPushSingleton();
  }

  public static BillPushSingleton getInstance() {
    return SingletonHelper.SINGLETON;
  }

}
