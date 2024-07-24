import java.util.Arrays;
import java.util.*;

public class Kadane_algo {
  public static void pair(int arr[]) {
    int c_sum = 0;
    int max_sum = 0;

    for (int i = 0; i < arr.length; i++) {
      c_sum += arr[i];
      if (c_sum < 0) {
        c_sum = 0;
      }
      if (c_sum > max_sum) {
        max_sum = c_sum;
      }

    }
    int result = Math.max(max_sum, c_sum);
    System.out.println(result);

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
