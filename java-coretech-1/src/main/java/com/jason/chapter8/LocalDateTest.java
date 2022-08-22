package com.jason.chapter8;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.JapaneseDate;

public class LocalDateTest {

  public static void main(String[] args) {
    LocalDate[] localDates = new LocalDate[]{
      LocalDate.of(2001, 1, 1),
      LocalDate.of(2003, 1, 1),
      LocalDate.of(2005, 1, 1),
    };
    System.out.println(min(localDates));

    ChronoLocalDate[] chronoLocalDates1 = new LocalDate[] {
      LocalDate.of(2001, 1, 1),
      LocalDate.of(2003, 1, 1),
      LocalDate.of(2005, 1, 1),
    };
    System.out.println(min(chronoLocalDates1));

    ChronoLocalDate[] chronoLocalDates2 = new JapaneseDate[] {
      JapaneseDate.of(2001, 1, 1),
      JapaneseDate.of(2003, 1, 1),
      JapaneseDate.of(2005, 1, 1),
    };
    System.out.println(min(chronoLocalDates2));
  }

  public static <T extends Comparable<? super T>> T min(T[] a) {
    T min = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i].compareTo(min) < 0) {
        min = a[i];
      }
    }
    return min;
  }
}
