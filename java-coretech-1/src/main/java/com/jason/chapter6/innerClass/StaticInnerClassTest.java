package com.jason.chapter6.innerClass;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StaticInnerClassTest {
  public static void main(String[] args) {
    double[] values = new double[20];
    for (int i = 0; i < values.length; i++) {
      values[i] = 100 * Math.random();
    }
    ArrayAlg.Pair p = ArrayAlg.minmax(values);
    System.out.println("min = " + p.getFirst());
    System.out.println("max = " + p.getSecond());
  }


}
class ArrayAlg {
  @Data
  @AllArgsConstructor
  public static class Pair {
    private double first;
    private double second;
  }

  public static Pair minmax(double[] values) {
    double min = Double.POSITIVE_INFINITY;
    double max = Double.NEGATIVE_INFINITY;
    for (double v : values) {
      if (min > v) {
        min = v;
      }
      if (max < v) {
        max = v;
      }
    }
    return new Pair(min, max);
  }
}