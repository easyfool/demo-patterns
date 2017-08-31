package com.wangfengbabe.designpattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by wangfeng on 31/08/2017.
 */
public class DestorySingletonWIthReflection {

  public static void main(String[] args) {
    EagerInitializationSingleton first = EagerInitializationSingleton.getInstance();
    EagerInitializationSingleton second = null;
    Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      constructor.setAccessible(true);
      try {
        second = (EagerInitializationSingleton) constructor.newInstance();
      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      }
    }

    System.out.println(first.hashCode());
    System.out.println(second.hashCode());


  }

}
