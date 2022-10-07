package com.jason.chapter9.sortedSet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {

  private String name;

  private int age;


  @Override
  public int compareTo(Person o) {
    int diff = Integer.compare(this.age, o.age);
    return diff != 0 ? diff : this.name.compareTo(o.name);
  }
}
