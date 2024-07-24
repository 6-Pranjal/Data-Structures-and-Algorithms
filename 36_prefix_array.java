import java.util.Arrays;
import java.util.*;

public class prefix_array {
  public static void pair(int arr[]) {
    int[] p = new int[arr.length];
    p[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
      p[i] = p[i - 1] + arr[i];
    }
    System.out.println(Arrays.toString(p));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("prefix sum");
    do {
      System.out.print("size:");
      int s = sc.nextInt();
      int arr[] = new int[s];
      System.out.println("enter elements of an array");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      pair(arr);

    } while (true);
  }

}
