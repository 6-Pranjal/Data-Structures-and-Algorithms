import java.util.Scanner;

public class subarrays {
  public static void pair(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j <= arr.length; j++) {

        for (int k = i; k < j; k++) {
          System.out.print(arr[k]);
        }

        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("pairs present in  given array");
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
