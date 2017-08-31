package com.wangfengbabe.designpattern.creational.abstract_factory;

/**
 * Created by wangfeng on 31/08/2017.
 */
public interface IAnimalFactory {
  public ICat createCat();
  public IDog createDog();

}
