package com.wangfengbabe.designpattern.creational.builder.car;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class BMWBuilder implements ICarBuilder {

  private ICar bmwCar = new BMWCar();

  public ICar getBmwCar() {
    return bmwCar;
  }

  public void setBmwCar(ICar bmwCar) {
    this.bmwCar = bmwCar;
  }

  @Override
  public void buildWheel() {
    bmwCar.setWheel("BMW");
  }

  @Override
  public void buildWindow() {
    bmwCar.setWindow("BMW");
  }

  @Override
  public void buildEngine() {
    bmwCar.setEngine("BMW");
  }

  @Override
  public ICar buildCar() {
    return bmwCar;
  }
}
