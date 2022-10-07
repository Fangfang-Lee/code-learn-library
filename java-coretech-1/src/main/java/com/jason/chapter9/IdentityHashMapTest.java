package com.jason.chapter9;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapTest {
  public static void main(String[] args) {
    Map<String, String> map = new IdentityHashMap<>();
    map.put("a", "1");
    String str = "aaa";
    int hashCode = System.identityHashCode(str);
    System.out.println(map);
    System.out.println(hashCode);
    str = "bbb";
    // identityHashCode是根据 引用指向的对象的内存地址 来算出来的hash码
    hashCode = System.identityHashCode(str);
    System.out.println(hashCode);

    String str1 = str;
    int str1HashCode = System.identityHashCode(str1);
    System.out.println(str1HashCode);
  }
}
