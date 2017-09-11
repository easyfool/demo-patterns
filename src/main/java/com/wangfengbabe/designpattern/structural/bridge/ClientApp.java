package com.wangfengbabe.designpattern.structural.bridge;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    Vehicle vehicle = new Car(new Produce(), new Assemble());
    vehicle.manufacture();

    Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
    vehicle2.manufacture();
  }

}
