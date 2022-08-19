package com.jason.chapter7.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 再次抛出异常与异常链
 */
public class ExceptionTest1 {

  public static void main(String[] args) {
    try {
      testBadCode();
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      testCorrectCode();
    } catch (Exception e) {
      // 捕获到这个异常时，可以使用这条语句来获取原始异常
      System.out.println(e.getCause());
    }
  }

  public static void testBadCode() throws RuntimeException {
    try {
      File file = new File("aa");
      FileReader fileReader = new FileReader(file);
    } catch (FileNotFoundException e) {
      throw new RuntimeException("fileNotFound error: " + e.getMessage());
    }
  }

  public static void testCorrectCode() {
    try {
      File file = new File("bb");
      FileReader fileReader = new FileReader(file);
    } catch (FileNotFoundException original) {
      RuntimeException e = new RuntimeException("fileNotFound error");
      e.initCause(original);
      throw e;
    }
  }
}
