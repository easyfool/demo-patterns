package com.wangfengbabe.designpattern.creational.builder.house;

/**
 * Created by wangfeng on 11/09/2017.
 */
public interface HouseBuilder {

  public void buildBasement();

  public void buildStucture();

  public void buildRoof();

  public void buildInterior();

  public House getHouse();

}
