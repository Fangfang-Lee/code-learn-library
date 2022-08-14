package com.jason.chapter6.lambda;

import java.util.function.BooleanSupplier;

public class BooleanSupplierTest {

  public static void main(String[] args) {
    String str1 = "str1";
    String str2 = "str2";
    System.out.println(f(10, () -> str1.equals(str2)));

  }

  public static boolean f(int n, BooleanSupplier action) {
    for (int i = 0; i < n; i++) {
      return action.getAsBoolean();
    }
    return false;
  }
}
