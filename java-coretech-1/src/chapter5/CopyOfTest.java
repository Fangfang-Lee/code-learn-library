package chapter5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOfTest {

  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    a = (int[]) goodCopyOf(a, 10);
    System.out.println(Arrays.toString(a));

    String[] b = {"Tom", "Dick", "Harry"};
    b = (String[]) goodCopyOf(b, 10);
    System.out.println(Arrays.toString(b));

    System.out.println("The following call will generate an exception.");
    // 对象数组可以强制转换为Object[]，但是Object[]不能强制转换为某一类型的数组。因为要在内存开辟空间，因此强制类型转换时就会报错ClassCastException。
    b = (String[]) badCopyOf(b, 10);
    System.out.println(Arrays.toString(b));

    String[] str = {"1", "2"};
    System.out.println((Object[]) str);

    // 对象数组可以强制转换为Object[]，但是Object[]不能强制转换为某一类型的数组。因为要在内存开辟空间，因此强制类型转换时就会报错ClassCastException。
    Object[] obj = new Object[1];
    System.out.println((String[]) obj);
  }

  public static Object[] badCopyOf(Object[] a, int newLength) {
    Object[] newArray = new Object[newLength];
    System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
    return newArray;
  }

  public static Object goodCopyOf(Object a, int newLength) {
    Class<?> cl = a.getClass();
    if (!cl.isArray()) {
      return null;
    }
    Class<?> componentType = cl.getComponentType();
    int length = Array.getLength(a);
    Object newArray = Array.newInstance(componentType, newLength);
    System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
    return newArray;
  }
}
