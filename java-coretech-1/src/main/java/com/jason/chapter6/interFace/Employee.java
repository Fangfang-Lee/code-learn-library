package com.jason.chapter6.interFace;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.GregorianCalendar;

@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee>, Cloneable {

  private String name;
  private double salary;
  private Date hireDay;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    hireDay = new Date();
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }

  /**
   * Compares employees by salary
   * @param o other another Employee object
   * @return a negative value if this employee has a lower salary than
   * otherObject, 0 if the salaries are the same, a positive value otherwise
   */
  public int compareTo(Employee o) {
    return Double.compare(salary, o.salary);
  }

  @Override
  public Employee clone() {
    try {
      // call Object.clone()
      Employee clone = (Employee) super.clone();

      // clone mutable fields
      clone.hireDay = (Date) hireDay.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  /**
   * Set the hire day to a given date
   * @param year year the year of the hire day
   * @param month month the month of the hire day
   * @param day day the day of the hire day
   */
  public void setHireDay(int year, int month, int day) {
    Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
    // example of instance field mutation
    hireDay.setTime(newHireDay.getTime());
  }

  public String toString() {
    return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
  }
}
