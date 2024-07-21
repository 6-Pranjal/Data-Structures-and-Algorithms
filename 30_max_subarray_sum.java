import java.util.Scanner;

public class max_subarray_sum {
  public static void pair(int arr[]) {
    int[] p = new int[arr.length];
    p[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      p[i] = p[i - 1] + arr[i];
    }

    int max_s = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j <= arr.length; j++) {
        int sum = 0;
        if (i == 0) {
          sum = p[j] - p[i];
        } else {
          sum = p[j] - p[i - 1];
        }

        System.out.print(" sum: " + sum + " ");
        if (sum > max_s) {
          max_s = sum;
        }

        System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("max sum: " + max_s + " ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("maximum sum or aub array");
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
