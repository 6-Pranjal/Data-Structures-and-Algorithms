import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Binary Search");
    do {
      System.out.print("size:");
      int s = sc.nextInt();
      int arr[] = new int[s];
      System.out.println("enter elements of an array");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("element to be searched : ");
      int k = sc.nextInt();

      Arrays.sort(arr);

      System.out.println(Arrays.toString(arr));

      int index = Arrays.binarySearch(arr, k);
      if (index > 0 && index < arr.length) {
        System.out.println("elememnt is present at index : " + index);
        System.out.println();
      } else {
        System.out.println("element is not present");
      }

    } while (true);
  }

}