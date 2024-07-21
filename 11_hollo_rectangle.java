
import java.util.Scanner;

public class hollo_rectangle {

  public static void pattern(int r, int c) {

    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= c; j++) {
        if (i == 1 || i == r || j == 1 || j == c) {
          System.out.print("*");

        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hollow Rectangle");

    do {
      System.out.print("r:");
      int r = sc.nextInt();
      System.out.print("c:");
      int c = sc.nextInt();

      pattern(r, c);
    } while (true);
  }
}
