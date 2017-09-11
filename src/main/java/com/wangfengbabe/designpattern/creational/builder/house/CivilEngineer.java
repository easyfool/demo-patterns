package com.wangfengbabe.designpattern.creational.builder.house;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class CivilEngineer {

  private HouseBuilder houseBuilder;

  public CivilEngineer(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  public House getHouse() {
    return this.houseBuilder.getHouse();
  }

  public void constructHouse() {
    this.houseBuilder.buildBasement();
    this.houseBuilder.buildStucture();
    this.houseBuilder.buildRoof();
    this.houseBuilder.buildInterior();
  }
}
