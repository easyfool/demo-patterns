package com.wangfengbabe.designpattern.structural.observer;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        Subject stock = new StockSubject();

        Observer owner = new CorporationOwner();

        Observer holder = new StockHolder();

        stock.registerObservers(Arrays.asList(owner, holder));

        if (stock instanceof StockSubject) {
            ((StockSubject) stock).profitEarn();
        }
    }

}
