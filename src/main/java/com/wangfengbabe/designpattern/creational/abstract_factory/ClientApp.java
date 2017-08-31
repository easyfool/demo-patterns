package com.wangfengbabe.designpattern.creational.abstract_factory;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    IAnimalFactory blackFactory = new BlackAnimalFactory();
    ICat blackCat = blackFactory.createCat();
    blackCat.eat();
    IDog blackDog = blackFactory.createDog();
    blackDog.eat();

    IAnimalFactory whiteFactory = new WhiteAnimalFactory();
    ICat whiteCat = whiteFactory.createCat();
    whiteCat.eat();
    IDog whiteDog = whiteFactory.createDog();
    whiteDog.eat();

  }

}
