package com.wangfengbabe.designpattern.creational.builder.house;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    HouseBuilder iglooBuilder = new IglooHouseBuilder();
    CivilEngineer engineer = new CivilEngineer(iglooBuilder);
    engineer.constructHouse();

    House house = engineer.getHouse();
    System.out.println("Builder constructed " + house);

    HouseBuilder tipiHouseBuilder = new TipiHouseBuilder();
    engineer = new CivilEngineer(tipiHouseBuilder);
    engineer.constructHouse();

    house = engineer.getHouse();
    System.out.println("Builder constructed " + house);
  }

}
