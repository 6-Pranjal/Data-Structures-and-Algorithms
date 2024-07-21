
import java.util.Scanner;

public class triangle_0_1 {

  public static void pattern1(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
        if (j % 2 == 0) {
          System.out.print("0");
        } else {
          System.out.print("1");
        }
      }
      System.out.println();
    }
  }

  public static void pattern2(int r) {
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {

        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" 0_1 triangle ");
    do {
      System.out.print("n:");
      int n = sc.nextInt();

      pattern1(n);
    } while (true);

  }

}
