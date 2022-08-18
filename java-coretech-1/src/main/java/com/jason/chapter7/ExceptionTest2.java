package com.jason.chapter7;

import lombok.extern.java.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 有时你只想记录一个异常，再将它重新抛出，而不做任何改变
 */
public class ExceptionTest2 {

  static Logger logger = Logger.getLogger(ExceptionTest2.class.getName());

  public static void main(String[] args) {

  }

  public static void throwTest() throws FileNotFoundException {
    try {
      File file = new File("aa");
      FileReader fileReader = new FileReader(file);

    } catch (FileNotFoundException e) {
      logger.log(Level.WARNING, "file Not found", e);
      throw e;
    }
  }
}
