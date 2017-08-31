package com.wangfengbabe.designpattern.creational.factory.better;


import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangfeng on 30/08/2017.
 */
public class EmployeeApp {

  private static final Logger logger = LoggerFactory.getLogger(
      EmployeeApp.class);

  static Map<String, RoleType> map = new HashMap<String, RoleType>();

  static {
    for (RoleType roleType : RoleType.values()) {
      map.put(roleType.getCode(), roleType);
    }
  }

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    IRole role = map.get(RoleType.CEO.getCode()).getRole();
    System.out.println(role.getRoleDescription());
    long endTime = System.nanoTime();
    logger.info("totally cost {} nano seconds", endTime - startTime);

  }

}
