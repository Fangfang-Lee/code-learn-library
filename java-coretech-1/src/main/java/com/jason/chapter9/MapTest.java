package com.jason.chapter9;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

  public static void main(String[] args) {
//    testMerge();
//    testCompute();
//    testComputeIfPresent();
//    testComputeIfAbsent();
//    testReplaceAll();
    testPutIfAbsent();
  }

  /**
   * putIfAbsent：如果key不存在或者与null关联，则将它与value关联，并返回null。否则返回关联的值。
   */
  public static void testPutIfAbsent() {
    Map<String, String> map = new HashMap<>();
    map.put("a", "1");
    map.put("b", "2");
    map.putIfAbsent("c", "3");
    System.out.println(map); // {a=1, b=2, c=3}
  }

  /**
   * replaceAll：在所有映射条目上应用这个函数。将键与非null结果关联，对于null结果，则将相应的键删除
   */
  public static void testReplaceAll() {
    Map<String, String> map = new HashMap<>();
    map.put("a", "1");
    map.put("b", "2");
    map.replaceAll((k, v) -> k + v);
    System.out.println(map); // a=a1,b=b2
  }

  /**
   * computeIfAbsent：将这个函数应用到key，除非key与一个非null值关联。将key与结果关联，或者如果结果为null，则删除这个键。返回get(key)
   */
  public static void testComputeIfAbsent() {
    Map<String, String> map = new HashMap<>();
    map.put("a", "1");
    map.put("b", "2");
    map.computeIfAbsent("c", v -> v + "a");
    System.out.println(map);
    map.computeIfAbsent("c", v -> null);
    System.out.println(map);
  }

  /**
   * computeIfPresent：如果key与一个非null值v关联，将函数应用到key和v，将key与结果关联，或者如果结果为null，则删除这个键。返回get(key)
   */
  public static void testComputeIfPresent() {
    Map<String, String> map = new HashMap<>();
    map.put("a", "1");
    map.put("b", "2");
    map.computeIfPresent("a", (v1, v2) -> v1 + v2);
    System.out.println(map);  // a=a1,b=2
    map.computeIfPresent("a", (v1, v2) -> null);
    System.out.println(map);  // b=2
  }

  /**
   * compute：将函数应用到key和get(key)。将key与结果关联，或者如果为null，则删除这个键。返回get(key)。
   */
  public static void testCompute() {
    Map<String, String> map = new HashMap<>();
    map.put("a", "1");
    map.put("b", "2");
    String value1 = map.compute("a", (v1, v2) -> v1 + v2);  // a=a1,b=2
    System.out.println(value1);
    map.compute("a", (v1, v2) -> null); // {b=2}
    System.out.println(map);
  }

  /**
   * merge：如果key与一个非null值v关联，将函数应用到v和value，将key与结果关联，或者如果结果为null，则删除这个键。否则，将key与value关联，返回get(key)
   */
  public static void testMerge() {
    Map<String, String> map = new HashMap<>();
    map.put("a", "1");
    map.merge("a", "2", (v1, v2) -> v1 + v2); // a=12
    map.merge("b", "1", (v1, v2) -> v1); // a=12,b=1
    map.merge("a", "1", (v1, v2) -> null); // remove a
    System.out.println(map);
  }
}
