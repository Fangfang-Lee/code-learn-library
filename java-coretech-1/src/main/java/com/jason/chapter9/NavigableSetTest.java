package com.jason.chapter9;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {

  public static void main(String[] args) {
    NavigableSet<String> set = new TreeSet<>();
    set.add("5");
    set.add("1");
    set.add("3");
    set.add("9");
    set.add("7");

    System.out.println(set.higher("2"));
    System.out.println(set.lower("8"));
    System.out.println(set.ceiling("3"));
    System.out.println(set.floor("5"));
    System.out.println(set.pollFirst());
    System.out.println(set.pollLast());
    Iterator<String> stringIterator = set.descendingIterator();
    while (stringIterator.hasNext()) {
      System.out.println(stringIterator.next());
    }
  }
}
