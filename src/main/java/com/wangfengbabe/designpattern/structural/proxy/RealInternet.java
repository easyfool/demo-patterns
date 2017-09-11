package com.wangfengbabe.designpattern.structural.proxy;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class RealInternet implements Internet {

  @Override
  public void connectTo(String serverHost) throws Exception {
    System.out.println("connect to " + serverHost);
  }
}
