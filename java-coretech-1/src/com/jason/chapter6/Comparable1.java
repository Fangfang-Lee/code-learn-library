package com.jason.chapter6;

public class Comparable1 implements Comparable<Comparable1> {

  public int method() {
    return compareTo(new Comparable1());
  }
}
