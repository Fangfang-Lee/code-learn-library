package com.jason.chapter7.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ThrowableTest {
  public static void main(String[] args) {
    Throwable t = new Throwable();
    StringWriter out = new StringWriter();
    t.printStackTrace(new PrintWriter(out));
    String description = out.toString();
    System.out.println(description);


  }
}
