package com.jason.chapter8;

public class ArrayAlg1 {

  public static <T extends Comparable> T min(T[] a) {
    if (a == null || a.length == 0) {
      return null;
    }
    T smallest = a[0];
    for (int i = 1; i < a.length; i++) {
      if (smallest.compareTo(a[i]) > 0) {
        smallest = a[i];
      }
    }
    return smallest;
  }
}
