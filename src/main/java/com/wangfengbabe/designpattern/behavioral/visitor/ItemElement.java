package com.wangfengbabe.designpattern.behavioral.visitor;

/**
 * Created by wangfeng on 11/09/2017.
 */
public interface ItemElement {

  public int accept(ShoppingCartVisitor visitor);

}
