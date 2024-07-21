import java.util.Arrays;
import java.util.Scanner;

/**
 * linear_search
 */
public class linear_search {

  public static void ls(int arr[], int k) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == k) {
        System.out.print("key is present at index: " + i);
        return;

      }
    }
    System.out.println("key is not present");

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Linear Search");
    do {
      System.out.print("size:");
      int s = sc.nextInt();
      int arr[] = new int[s];
      System.out.println("enter elements of an array");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("key to be searched");
      int k = sc.nextInt();
      System.out.println(Arrays.toString(arr));

      ls(arr, k);
      System.out.println();

    } while (true);

  }
}