package com.wangfengbabe.designpattern.behavioral.template;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class NetOrder extends OrderProcessTemplate {

  @Override
  public void doSelect() {
    System.out.println("Item added to online shopping cart");
    System.out.println("Get gift wrap preference ");
    System.out.println("Get delivery address");
  }

  @Override
  public void doPayment() {
    System.out.println("Online Payment through Netbanking,card or Paytm");
  }

  @Override
  public void doDelivery() {
    System.out.println("Ship the item through post to delivery address");
  }
}
