package com.jason.chapter6;

import lombok.experimental.var;

import java.util.Arrays;
import java.util.Date;

/**
 * This program demonstrates the use of the Comparable interface.
 */
public class EmployeeSortTest {
  public static void main(String[] args) {
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Harry Hacker", 35000, new Date());
    staff[1] = new Employee("Carl Cracker", 75000, new Date());
    staff[2] = new Employee("Tony Tester", 38000, new Date());

    Arrays.sort(staff);

    // print out information about all Employee objects
    for (Employee e : staff) {
      System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
  }
}
