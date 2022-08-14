package com.jason.chapter6.classloader;

public class CaesarCipher implements Cipher {
  @Override
  public byte[] encrypt(byte[] source, byte[] key) {
    byte[] result = new byte[source.length];
    for (int i = 0; i < source.length; i++) {
      result[i] = (byte) (source[i] + key[0]);
    }
    return result;
  }

  @Override
  public byte[] decrypt(byte[] source, byte[] key) {
    return encrypt(source, new byte[] {(byte) -key[0]});
  }

  @Override
  public int strength() {
    return 1;
  }
}
