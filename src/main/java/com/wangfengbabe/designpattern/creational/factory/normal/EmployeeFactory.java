package com.wangfengbabe.designpattern.creational.factory.normal;

/**
 * Created by wangfeng on 30/08/2017.
 */
public abstract class EmployeeFactory {

  public static IRole getRole(RoleType roleType) {
    IRole role = null;
    switch (roleType) {
      case CEO:
        role = new CEORole();
        break;
      case CFO:
        role = new CFORole();
        break;
      case CTO:
        role = new CTORole();
        break;
      default:
        System.out.println("role type not supported");

    }
    return role;
  }

}
