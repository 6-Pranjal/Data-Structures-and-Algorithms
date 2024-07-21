import java.util.Arrays;
import java.util.Scanner;

public class largest_no {

  public static void check(int arr[]) {
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    System.out.println(" largest value in the given array is : " + largest);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Largest value in given array");
    do {
      System.out.print("size:");
      int s = sc.nextInt();
      int arr[] = new int[s];
      System.out.println("enter elements of an array");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      System.out.println(Arrays.toString(arr));

      check(arr);
      System.out.println();

    } while (true);

  }

}
