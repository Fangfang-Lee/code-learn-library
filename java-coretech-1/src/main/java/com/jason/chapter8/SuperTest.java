package com.jason.chapter8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

public class SuperTest {

  public static void main(String[] args) {
    Manager[] managers = new Manager[]{
      new Manager(1),
      new Manager(3),
      new Manager(5),
      new Manager(7),
      new Manager(9),
    };
    Pair<Person> pair = new Pair();  // 正确
//    Pair<WomanManager> pair = new Pair();  // 错误
    minmaxBonus(managers, pair);
    System.out.println(pair);
  }

  public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
    if (a.length == 0) {
      return;
    }
    Manager min = a[0];
    Manager max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (min.getBonus() > a[i].getBonus()) {
        min = a[i];
      }
      if (max.getBonus() < a[i].getBonus()) {
        max = a[i];
      }
    }
    result.setFirst(min);
    result.setSecond(max);
  }
}
@Data
@AllArgsConstructor
class Person {
  private Integer bonus;

  private String name;

  private LocalDate birthday;
}

class Manager extends Person {
  public Manager(Integer bonus) {
    super(bonus, "default", LocalDate.of(2000, 1, 1));
  }

  public Manager(String name, Integer bonus, Integer year, Integer month, Integer day) {
    super(bonus, name, LocalDate.of(year, month, day));
  }
}

class WomanManager extends Manager {

  public WomanManager(Integer bonus) {
    super(bonus);
  }
}
