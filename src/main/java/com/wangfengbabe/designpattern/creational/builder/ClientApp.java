package com.wangfengbabe.designpattern.creational.builder;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    ICarBuilder builder = new BenzBuilder();
    CarDirector director = new CarDirector(builder);
    ICar car = director.constructCar();
    System.out.println(car);

    builder = new BMWBuilder();
    director.setBuilder(builder);
    car = director.constructCar();
    System.out.println(car);

  }

}
