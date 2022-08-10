package com.jason.chapter6;

public interface Comparable<T> {

  default int compareTo(T other) {
    return 0;
  }
}
