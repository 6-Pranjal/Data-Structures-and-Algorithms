import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {

  public static void reverse(int arr[]) {
    int j = arr.length - 1;
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j--;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("reverse an array");
    do {
      System.out.print("size:");
      int s = sc.nextInt();
      int arr[] = new int[s];
      System.out.println("enter elements of an array");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }

      reverse(arr);

    } while (true);
  }

}
