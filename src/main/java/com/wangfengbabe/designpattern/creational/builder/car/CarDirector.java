package com.wangfengbabe.designpattern.creational.builder.car;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class CarDirector {

  public ICarBuilder getBuilder() {
    return builder;
  }

  public ICar constructCar() {
    builder.buildEngine();
    builder.buildWheel();
    builder.buildWindow();
    return builder.buildCar();
  }

  public void setBuilder(ICarBuilder builder) {
    this.builder = builder;
  }

  public CarDirector(ICarBuilder builder) {

    this.builder = builder;
  }

  private ICarBuilder builder;

}
