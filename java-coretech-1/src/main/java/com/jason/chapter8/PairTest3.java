package com.jason.chapter8;

public class PairTest3 {
  public static void main(String[] args) {
    Pair<String> stringPair = new Pair<>();
    Pair<Employee> employeePair = new Pair<>();
    System.out.println(stringPair.getClass() == employeePair.getClass());
  }

  /**
   * 所有的类型查询只产生原始类型
   * @param a
   * @param <T>
   */
  public <T> void test1(T a) {
//    if (a instanceof Pair<String>) {}   Error
//    if (a instanceof Pair<T>) {}        Error
//    if (a instanceof Pair) {}           Correct
  }

}

class Employee {

}
