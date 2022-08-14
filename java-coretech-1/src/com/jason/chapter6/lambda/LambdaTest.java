package com.jason.chapter6.lambda;

import javax.swing.Timer;
import java.util.Arrays;

/**
 * This program demonstrates the use of lambda expressions
 */
public class LambdaTest {

  public static void main(String[] args) {
    String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    System.out.println(Arrays.toString(planets));
    System.out.println("Sorted in dictionary order:");
    Arrays.sort(planets);
    System.out.println(Arrays.toString(planets));
    System.out.println("Sorted by length:");
    Arrays.sort(planets, (first, second) -> first.length() - second.length());
    System.out.println(Arrays.toString(planets));

    Timer timer = new Timer(1000, System.out::println);

    Arrays.sort(planets, String::compareToIgnoreCase);
    Arrays.sort(planets, (x, y) -> x.compareToIgnoreCase(y));

    Integer[] integers = new Integer[]{1, 2, 3, 4};
    java.util.Arrays.stream(integers).map((x) -> Math.pow(x, 1));


  }
}
