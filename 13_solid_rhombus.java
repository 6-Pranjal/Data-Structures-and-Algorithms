import java.util.Scanner;

public class solid_rhombus {

  public static void pattern1(int r) {

    for (int i = 1; i <= r; i++) {

      for (int j = 1; j <= r; j++) {
        if (j <= r - i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();

      for (int j = r + 1; j < 2 * r; j++) {
        if (j > r || j < 2 * r - i - 1) {
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
    System.out.println(" Solid_Rhombus ");
    do {
      System.out.print("n:");
      int n = sc.nextInt();

      pattern1(n);
    } while (true);

  }

}
