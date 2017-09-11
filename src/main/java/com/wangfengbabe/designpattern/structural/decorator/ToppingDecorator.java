package com.wangfengbabe.designpattern.structural.decorator;

/**
 * Created by wangfeng on 11/09/2017.
 * The decorator class : it extends Pizza to be interchangeble with it topings
 * decorator can also be implemented as an interface
 */
public abstract class ToppingDecorator extends Pizza {

  public abstract String getDescription();


}
