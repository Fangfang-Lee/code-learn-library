package com.jason.chapter6.innerClass;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


public class InnerClassTest {
  public static void main(String[] args) {
    TalkingClock clock = new TalkingClock(1000, true);
    clock.start();

    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }


}
@Data
@AllArgsConstructor
class TalkingClock {
  private int interval;
  private boolean beep;

  public void start() {
    TimePrinter listener = new TimePrinter();
    Timer timer = new Timer(interval, listener);
    timer.start();
  }

  class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("At the tone, the time is" +
        Instant.ofEpochMilli(e.getWhen()));
      if (beep) {
        Toolkit.getDefaultToolkit().beep();
      }
    }
  }
}
