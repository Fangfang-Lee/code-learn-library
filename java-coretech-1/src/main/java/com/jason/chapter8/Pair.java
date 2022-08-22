package com.jason.chapter8;

public class Pair<T> {

  private T first;
  private T second;

  public Pair() {
    first = null;
    second = null;
  }

  public Pair(T first, T second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public T getSecond() {
    return second;
  }

  public void setFirst(T first) {
    this.first = first;
  }

  public void setSecond(T second) {
    this.second = second;
  }

  @Override
  public String toString() {
    return "Pair{" +
      "first=" + first +
      ", second=" + second +
      '}';
  }
}
