package com.jason.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateTest {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    Collections.rotate(list, 3);
    System.out.println(list);
  }
}
