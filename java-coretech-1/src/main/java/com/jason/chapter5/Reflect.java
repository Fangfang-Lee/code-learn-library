package com.jason.chapter5;

import java.lang.reflect.Field;

public class Reflect {

  private String name;

  public Reflect() {
    name = "小明";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) throws Exception {
    Reflect reflect = new Reflect();
    Class reflectClass = reflect.getClass();
    Field name = reflectClass.getDeclaredField("name");
    Object o = name.get(reflect);
    name.set(reflect, "小李");
    System.out.println(o);
  }

}
