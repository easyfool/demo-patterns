package com.wangfengbabe.designpattern.creational.singleton;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();
    EagerInitializationSingleton singleton2 = EagerInitializationSingleton.getInstance();
    System.out.println(singleton1 == singleton2);
  }

}
