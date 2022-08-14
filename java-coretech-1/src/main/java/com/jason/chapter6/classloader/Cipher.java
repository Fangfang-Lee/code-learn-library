package com.jason.chapter6.classloader;

public interface Cipher {
  byte[] encrypt(byte[] source, byte[] key);
  byte[] decrypt(byte[] source, byte[] key);
  int strength();
}
