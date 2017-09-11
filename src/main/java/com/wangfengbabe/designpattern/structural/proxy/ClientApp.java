package com.wangfengbabe.designpattern.structural.proxy;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    Internet internet = new ProxyInternet();
    try {
      internet.connectTo("geeksforgeeks.com");
      internet.connectTo("abc.com");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
