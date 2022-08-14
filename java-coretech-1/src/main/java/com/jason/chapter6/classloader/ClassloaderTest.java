package com.jason.chapter6.classloader;

import java.util.ServiceLoader;

public class ClassloaderTest {

  public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

  public static Cipher getCipher(int minStrength) {
    for (Cipher cipher : cipherLoader) { // implicitly calls cipherLoader.iterator()
      if (cipher.strength() >= minStrength) {
        return cipher;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(getCipher(1));
  }
}
