package com.wangfengbabe.designpattern.creational.factory.normal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangfeng on 30/08/2017.
 */
public class EmployeeApp {

  private static final Logger logger = LoggerFactory.getLogger(EmployeeApp.class);

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    IRole role = EmployeeFactory.getRole(RoleType.CEO);
    System.out.println(role.getRoleDescription());
    long endTime = System.nanoTime();
    logger.info("totally cost {} nano seconds", endTime - startTime);

  }

}
