package com.jason.chapter9;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
  public static void main(String[] args) {
    PriorityQueue<LocalDate> pq = new PriorityQueue<>();
    pq.add(LocalDate.of(1906, 12, 9));
    pq.add(LocalDate.of(1815, 12, 10));
    pq.add(LocalDate.of(1903, 12, 3));
    pq.add(LocalDate.of(1910, 6, 22));

    System.out.println("Iterating over elements...");
    for (LocalDate date : pq) {
      System.out.println(date);
    }
    System.out.println("Removing elements...");
    while (!pq.isEmpty()) {
      System.out.println(pq.remove());
    }
  }
}
