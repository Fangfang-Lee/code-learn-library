package com.jason.chapter7.exception;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TryWithResourcesTest {

  public static void main(String[] args) {
    try (Scanner in = new Scanner(new FileInputStream("/Users/jason/IdeaProjects/code-learn-library/java-coretech-1/src/main/resources/file/tryWithResourcesFile"), StandardCharsets.UTF_8.toString())) {
      while (in.hasNext()) {
        System.out.println(in.next());
      }
    } catch (Exception e) {
      System.out.println(e.getCause());
    }
  }


}
