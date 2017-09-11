package com.wangfengbabe.designpattern.behavioral.visitor;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

  @Override
  public int visit(Fruit fruit) {
    int cost = fruit.getPricePerKg() * fruit.getWeight();
    System.out.println("fruit " + fruit.getName() + " cost = " + cost);
    return cost;
  }

  @Override
  public int visit(Book book) {
    int cost = 0;
    if (book.getPrice() > 50) {
      cost = book.getPrice() - 5;
    } else {
      cost = book.getPrice();
    }
    System.out.println(book.getIsbnNumber() + " cost = " + cost);
    return cost;
  }
}
