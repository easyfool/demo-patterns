package com.wangfengbabe.designpattern.creational.builder.house;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class IglooHouseBuilder implements HouseBuilder {

  private House house;

  public IglooHouseBuilder() {
    this.house = new House();
  }

  @Override
  public void buildBasement() {
    house.setBasements("Ice bars");
  }

  @Override
  public void buildStucture() {
    house.setStructure("Ice blocks");
  }

  @Override
  public void buildRoof() {
    house.setRoof("Ice Dome");
  }

  @Override
  public void buildInterior() {
    house.setInterior("Ice Carvings");
  }

  @Override
  public House getHouse() {
    return this.house;
  }
}
