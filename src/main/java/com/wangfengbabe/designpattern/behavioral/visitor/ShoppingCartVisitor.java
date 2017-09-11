package com.wangfengbabe.designpattern.behavioral.visitor;

/**
 * Created by wangfeng on 11/09/2017.
 */
public interface ShoppingCartVisitor {

  public int visit(Fruit fruit);

  public int visit(Book book);
}
