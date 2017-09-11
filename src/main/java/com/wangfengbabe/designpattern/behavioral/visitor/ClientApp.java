package com.wangfengbabe.designpattern.behavioral.visitor;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ClientApp {

  public static void main(String[] args) {
    ItemElement[] items = new ItemElement[]{new Book(20, "1234"), new Book(100, "5678"), new Fruit(10, 2, "banana"),
        new Fruit(5, 5, "apple")};
    int total = calculatePrice(items);
    System.out.println("Total cost = " + total);
  }

  private static int calculatePrice(ItemElement[] items) {
    ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
    int sum = 0;
    for (ItemElement item : items) {
      sum += item.accept(visitor);
    }
    return sum;
  }

}
