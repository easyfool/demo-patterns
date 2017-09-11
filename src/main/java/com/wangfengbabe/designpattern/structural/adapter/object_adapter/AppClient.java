package com.wangfengbabe.designpattern.structural.adapter.object_adapter;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class AppClient {

  public static void main(String[] args) {
    Bird sparrow = new Sparrow();
    ToyDuck plasticToyDuck = new PlasticToyDuck();
    //wrap a bird in a birdadpter so that it behaves like toyduck
    ToyDuck birdAdapter = new BirdAdpater(sparrow);
    System.out.println("sparrow");
    sparrow.fly();
    sparrow.makesound();

    System.out.println("toy duck");
    plasticToyDuck.squeak();

    //bird behaving like a toy duck
    System.out.println("bird adapter");
    birdAdapter.squeak();
  }

}
