package com.jason.chapter6.interFace;

public interface Comparable<T> {

  default int compareTo(T other) {
    return 0;
  }
}
