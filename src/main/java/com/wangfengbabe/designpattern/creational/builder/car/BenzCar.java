package com.wangfengbabe.designpattern.creational.builder.car;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class BenzCar implements ICar {

  private String engine;
  private String wheel;
  private String window;

  @Override
  public String getWheel() {
    return wheel;
  }

  @Override
  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  @Override
  public String getWindow() {
    return this.window;
  }

  @Override
  public void setWindow(String window) {
    this.window = window;
  }

  @Override
  public String getEngine() {
    return this.engine;
  }

  @Override
  public void setEngine(String engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "BenzCar{" +
        "engine='" + engine + '\'' +
        ", wheel='" + wheel + '\'' +
        ", window='" + window + '\'' +
        '}';
  }
}
