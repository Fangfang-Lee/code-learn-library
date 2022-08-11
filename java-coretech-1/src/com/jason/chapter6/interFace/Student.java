package com.jason.chapter6.interFace;

public class Student implements Person, Named {


  @Override
  public String getName1() {
    return getName();
  }

  @Override
  public String toString() {
    return Person.super.toString();
  }
}
