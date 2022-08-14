package com.jason.chapter6.innerClass;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class AnonymousInnerClassTest {

  public static void main(String[] args) {
    TalkingClock clock = new TalkingClock();
    clock.start(1000, true);

    // keep program running until the user selects "OK"
    JOptionPane.showMessageDialog(null, "Quit program?");
    System.exit(0);
  }

  static class TalkingClock {
    public void start(int interval, boolean beep) {
      ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          System.out.println("At the tone, the time is " + Instant.ofEpochMilli(e.getWhen()));
          if (beep) {
            Toolkit.getDefaultToolkit().beep();
          }
        }
      };
      Timer timer = new Timer(interval, listener);
      timer.start();
    }
  }
}
