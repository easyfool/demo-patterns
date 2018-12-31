package com.wangfengbabe.designpattern.structural.observer;

public class CorporationOwner implements Observer {

    public void display(Subject subject) {
        System.out.println("公司展示：" + subject);

    }

    @Override
    public void udpate(Subject subject) {
        display(subject);
    }
}
