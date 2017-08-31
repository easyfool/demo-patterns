package com.wangfengbabe.designpattern.creational.abstract_factory;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class WhiteAnimalFactory implements IAnimalFactory {

  @Override
  public ICat createCat() {
    return new WhiteCat();
  }

  @Override
  public IDog createDog() {
    return new WhiteDog();
  }
}
