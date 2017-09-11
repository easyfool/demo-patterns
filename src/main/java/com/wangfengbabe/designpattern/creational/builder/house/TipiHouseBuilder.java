package com.wangfengbabe.designpattern.creational.builder.house;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class TipiHouseBuilder implements HouseBuilder {

  private House house;

  public TipiHouseBuilder() {
    this.house = new House();
  }

  @Override
  public void buildBasement() {
    house.setBasements("Wooden Poles");
  }

  @Override
  public void buildStucture() {
    house.setStructure("Wood and Ice");
  }

  @Override
  public void buildRoof() {
    house.setRoof("Wood, caribou,and seal skins");
  }

  @Override
  public void buildInterior() {
    house.setInterior("fire wood");
  }

  @Override
  public House getHouse() {
    return this.house;
  }
}
