package com.jason.chapter9.treeSet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item implements Comparable<Item> {

  private String description;
  private int partNumber;

  @Override
  public int compareTo(Item o) {
    int diff = Integer.compare(partNumber, o.partNumber);
    return diff != 0 ? diff : description.compareTo(o.description);
  }
}
