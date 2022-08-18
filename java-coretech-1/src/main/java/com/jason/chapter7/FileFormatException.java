package com.jason.chapter7;

import java.io.BufferedReader;
import java.io.IOException;

public class FileFormatException extends IOException {
  public FileFormatException() {
  }

  public FileFormatException(String message) {
    super(message);
  }

}
