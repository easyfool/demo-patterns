package com.wangfengbabe.designpattern.structural.observer;

public class StockHolder implements Observer {

    public void check(Subject subject) {
        System.out.println("stockholder浏览：" + subject);
    }

    @Override
    public void udpate(Subject subject) {
        check(subject);
    }
}
