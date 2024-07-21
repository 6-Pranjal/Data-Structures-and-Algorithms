import java.util.Scanner;

public class half_butterfly {

  public static void pattern(int r) {
    int c = 2 * r;
    for (int i = 1; i <= r; i++) {

      for (int j = 1; j <= c; j++) {
        if (j <= i || j > c - i) {
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
    System.out.println("half_butterfly");
    do {
      System.out.print("n:");
      int n = sc.nextInt();

      pattern(n);
    } while (true);

  }

}
