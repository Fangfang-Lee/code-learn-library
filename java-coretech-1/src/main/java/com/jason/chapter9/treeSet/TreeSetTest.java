package com.jason.chapter9.treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

  public static void main(String[] args) {
    Set<Item> parts = new TreeSet<>();
    parts.add(new Item("Toaster", 1234));
    parts.add(new Item("Widget", 4562));
    parts.add(new Item("Modem", 9912));
    System.out.println(parts);

    Set<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

    sortByDescription.addAll(parts);
    System.out.println(sortByDescription);
  }
}
