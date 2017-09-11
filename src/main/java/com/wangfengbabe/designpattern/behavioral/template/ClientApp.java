package com.wangfengbabe.designpattern.behavioral.template;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    OrderProcessTemplate netOder = new NetOrder();
    netOder.processOrder(true);

    System.out.println();

    OrderProcessTemplate storeOrder = new StoreOrder();
    storeOrder.processOrder(false);
  }

}
