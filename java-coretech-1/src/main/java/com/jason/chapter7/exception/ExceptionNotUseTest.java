package com.jason.chapter7.exception;

import java.io.IOException;
import java.io.PrintStream;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 异常处理不能代替简单的测试
 */
public class ExceptionNotUseTest {

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Stack stack = new Stack();
    for (int i = 0; i < 10000000; i++) {
      testBad(stack);
    }
    long middle = System.currentTimeMillis();
    System.out.println(middle - start);
    for (int i = 0; i < 10000000; i++) {
      testCorrect(stack);
    }
    long end = System.currentTimeMillis();
    System.out.println(end - middle);
  }

  public static void testBad(Stack stack) {
    if (!stack.empty()) {
      stack.pop();
    }
  }

  public static void testCorrect(Stack stack) {
    try {
      stack.pop();
    } catch (EmptyStackException e) {

    }
  }

}
