package com.jason.chapter12.synch;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
  private final double[] accounts;
  private Lock bankLock;
  private Condition sufficientFunds;

  public Bank(int n, double initialBalance) {
    accounts = new double[n];
    Arrays.fill(accounts, initialBalance);
    bankLock = new ReentrantLock();
    sufficientFunds = bankLock.newCondition();
  }

  public void transfer(int from, int to, double amount) {
    bankLock.lock();
    try {

    } finally {
      bankLock.unlock();
    }
  }
}
