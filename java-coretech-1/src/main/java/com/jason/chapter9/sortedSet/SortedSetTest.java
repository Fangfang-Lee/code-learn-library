package com.jason.chapter9.sortedSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetTest {

  public static void main(String[] args) {

    Set<Person> set = new TreeSet<Person>(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

    set.add(new Person("abc", 456));
    set.add(new Person("abc", 123));
    set.add(new Person("abb", 123));
    set.add(new Person("ddd", 789));
    for (Person person : set) {
      System.out.println(person);
    }
  }
}
