import java.util.Arrays;
import java.util.Scanner;

/**
 * matrix
 */
public class matrix {

  // public static void create(int arr[][]){
  // Scanner sc=new Scanner(System.in);
  // for (int i = 0; i < arr.length; i++) {
  // for (int j = 0; j < arr.length; j++) {
  // arr[i][j]=sc.nextInt();
  // }
  // }

  // System.out.println(Arrays.deepToString(arr));
  // }

  public static void main(String[] args) {
    System.out.println("2-d Arrays/Matrix");
    do {
      Scanner sc = new Scanner(System.in);

      System.out.print("n:");
      int n = sc.nextInt();
      System.out.print("m:");
      int m = sc.nextInt();
      System.out.println("size:" + n + "*" + m);
      int arr[][] = new int[n][m];
      System.out.println("Input Elements");
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
          arr[i][j] = sc.nextInt();
        }
      }

      System.out.println(Arrays.deepToString(arr));
    } while (true);

  }

  // create(arr);
}
