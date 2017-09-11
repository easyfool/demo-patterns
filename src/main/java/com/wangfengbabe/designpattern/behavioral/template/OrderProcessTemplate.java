package com.wangfengbabe.designpattern.behavioral.template;

/**
 * Created by wangfeng on 11/09/2017.
 */
public abstract class OrderProcessTemplate {

  public boolean isGift;

  public abstract void doSelect();

  public abstract void doPayment();

  public abstract void doDelivery();

  public final void giftWrap() {
    try {
      System.out.println("Gift wrap successfully");
    } catch (Exception e) {
      System.out.println("Gift wrap unsuccessfully");
    }
  }

  //template method
  public void processOrder(boolean isGift) {
    doSelect();
    doPayment();
    if (isGift) {
      giftWrap();
    }
    doDelivery();
  }

}
