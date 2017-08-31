package com.wangfengbabe.designpattern.creational.factory.better;


/**
 * Created by wangfeng on 30/08/2017.
 */
public class CEORole implements IRole {


  @Override
  public String getRoleDescription() {
    return "CEO is the head of the company";
  }
}
