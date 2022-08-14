package com.jason.chapter6.proxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * This program demonstrates the use of proxies
 */
public class ProxyTest {

  public static void main(String[] args) {
    Object[] elements = new Object[1000];

    // fill elements with proxies for the integers 1 ... 1000
    for (int i = 0; i < elements.length; i++) {
      Integer value = i + 1;
      TraceHandler handler = new TraceHandler(value);
      Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Comparable.class}, handler);
      elements[i] = proxy;
    }

    System.out.println(Proxy.isProxyClass(elements[1].getClass()));  // true
    System.out.println(Proxy.isProxyClass(new Integer(1).getClass()));  // false

    // construct a random integer
    Integer key = new Random().nextInt(elements.length) + 1;

    // search for the key
    int result = Arrays.binarySearch(elements, key);

    // print match if found
    if (result >= 0) {
      System.out.println(elements[result]);
    }
  }

}
