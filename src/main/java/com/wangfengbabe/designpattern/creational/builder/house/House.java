package com.wangfengbabe.designpattern.creational.builder.house;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class House implements HousePlan {

  private String basements;
  private String structure;
  private String roof;

  @Override
  public String toString() {
    return "House{" +
        "basements='" + basements + '\'' +
        ", structure='" + structure + '\'' +
        ", roof='" + roof + '\'' +
        ", interior='" + interior + '\'' +
        '}';
  }

  private String interior;

  @Override
  public void setBasements(String basements) {
    this.basements = basements;
  }

  @Override
  public void setStructure(String structure) {
    this.structure = structure;
  }

  @Override
  public void setRoof(String roof) {
    this.roof = roof;
  }

  @Override
  public void setInterior(String interior) {
    this.interior = interior;
  }
}
