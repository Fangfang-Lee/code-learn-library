package com.jason.chapter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimePrinter implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
    Toolkit.getDefaultToolkit().beep();
  }

  public static void main(String[] args) {
    TimePrinter timePrinter = new TimePrinter();
    Timer t = new Timer(1000, timePrinter);
    t.start();

    // keep program running until the user selects "OK"
    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }
}
