package com.jason.chapter8;

public class PairTest1 {

  public static void main(String[] args) {

  }
}
class Arraylg {

  public static void main(String[] args) {
    Comparable middle = Arraylg.getMiddle(3.14, 1729, 0);
    System.out.println(middle);
  }

  public static Pair<String> minmax(String[] a) {
    if (a == null || a.length == 0) {
      return null;
    }
    String min = a[0];
    String max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (min.compareTo(a[i]) > 0) {
        min = a[i];
      }
      if (max.compareTo(a[i]) < 0) {
        max = a[i];
      }
    }
    return new Pair<>(min, max);
  }

  public static <T> T getMiddle(T... a) {
    return a[a.length / 2];
  }
}