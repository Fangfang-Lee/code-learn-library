package com.jason.chapter9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    Collection<String> unmodifiableList = Collections.unmodifiableCollection(list);
//    unmodifiableList.add("c");  // UnsupportedOperationException

    List<String> list1 = new ArrayList<>();
    List<String> checkedList = Collections.checkedList(list1, String.class);
    System.out.println(checkedList);
  }
}
