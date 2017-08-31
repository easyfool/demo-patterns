package com.wangfengbabe.designpattern.creational.factory.better;

/**
 * Created by wangfeng on 30/08/2017.
 */
public enum RoleType {
  CEO("CEO") {
    @Override
    public IRole getRole() {
      return new CEORole();
    }
  },

  CFO("CFO") {
    @Override
    public IRole getRole() {
      return new CFORole();
    }
  },

  CTO("CTO") {
    @Override
    public IRole getRole() {
      return new CTORole();
    }
  };
  private String code;

  RoleType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }


  public abstract IRole getRole();

}
