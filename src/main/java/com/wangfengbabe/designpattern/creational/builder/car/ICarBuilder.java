package com.wangfengbabe.designpattern.creational.builder.car;

/**
 * Created by wangfeng on 31/08/2017.
 */
public interface ICarBuilder {

  public void buildWheel();

  public void buildWindow();

  public void buildEngine();

  public ICar buildCar();

}
