package com.jason.chapter6.interFace;

import java.util.Date;

public class CloneTest {

  public static void main(String[] args) {
    Employee original = new Employee("John Public", 50000, new Date());
    Employee copy = original;
    copy.raiseSalary(10);
    System.out.println(original);
    System.out.println(copy);

    Employee copy1 = original.clone();
    copy1.raiseSalary(10);
    System.out.println(original);
    System.out.println(copy1);

    Employee employee = new Employee("John !. Public", 50000);
    employee.setHireDay(2000, 1, 1);
    Employee copyEmployee = employee.clone();
    copyEmployee.raiseSalary(10);
    copyEmployee.setHireDay(2002, 12, 31);
    System.out.println("origin=" + employee);
    System.out.println("copy=" + copyEmployee);
  }
}
