package com.wangfengbabe.designpattern.creational.builder;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class BenzBuilder implements ICarBuilder {

  private ICar benzCar = new BenzCar();

  @Override
  public void buildWheel() {
    benzCar.setWheel("benz");
  }

  @Override
  public void buildWindow() {
    benzCar.setWindow("benz");
  }

  @Override
  public void buildEngine() {
    benzCar.setEngine("benz");
  }

  @Override
  public ICar buildCar() {

    return benzCar;
  }
}
