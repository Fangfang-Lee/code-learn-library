package com.jason.chapter6.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceHandler implements InvocationHandler {

  private Object target;

  public TraceHandler(Object t) {
    this.target = t;
  }
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // print implicit argument
    System.out.print(target);
    // print method name
    System.out.print("." + method.getName() + "(");
    // print explicit arguments
    if (args != null) {
      for (int i = 0; i < args.length; i++) {
        System.out.print(args[i]);
        if (i < args.length - 1) {
          System.out.print(", ");
        }
      }
    }
    System.out.println(")");

    // invoke actual method
    return method.invoke(target, args);
  }
}
