package com.jason.chapter6.lambda;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.time.Instant;

public class Greeter {

  public void greet(ActionEvent event) {
    System.out.println("Hello, the time is " +
      Instant.ofEpochMilli(event.getWhen()));
  }

  class RepeatedGreeter extends Greeter {
    @Override
    public void greet(ActionEvent event) {
      Timer timer = new Timer(1000, super::greet);
      timer.start();
    }
  }
}
