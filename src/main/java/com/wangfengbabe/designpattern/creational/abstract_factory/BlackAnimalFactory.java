package com.wangfengbabe.designpattern.creational.abstract_factory;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class BlackAnimalFactory implements IAnimalFactory {

  @Override
  public ICat createCat() {
    return new BlackCat();
  }

  @Override
  public IDog createDog() {
    return new BlackDog();
  }
}
