package com.wangfengbabe.designpattern.structural.adapter.object_adapter;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class BirdAdpater implements ToyDuck {

  Bird bird;

  public BirdAdpater(Bird bird) {
    this.bird = bird;
  }

  @Override
  public void squeak() {
    bird.makesound();
  }
}
