package com.wangfengbabe.designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ColorStore {

  private static Map<String, Color> colorMap = new HashMap<String, Color>();

  static {
    colorMap.put("blue", new BlueColor());
    colorMap.put("black", new BlackColor());
  }

  public static Color getColor(String colorName) {
    return (Color) colorMap.get(colorName);
  }

}
