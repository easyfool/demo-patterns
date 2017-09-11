package com.wangfengbabe.designpattern.creational.prototype;

/**
 * Created by wangfeng on 11/09/2017.
 */
public abstract class Color implements Cloneable {

  protected String colorName;

  abstract void addColor();

  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }

}
