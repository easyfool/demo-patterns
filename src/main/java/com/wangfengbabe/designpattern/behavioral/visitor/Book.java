package com.wangfengbabe.designpattern.behavioral.visitor;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class Book implements ItemElement {

  private int price;
  private String isbnNumber;

  public int getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  public Book(int price, String isbnNumber) {

    this.price = price;
    this.isbnNumber = isbnNumber;
  }

  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
