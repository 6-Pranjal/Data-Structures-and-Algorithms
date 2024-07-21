import java.util.Scanner;

public class inverted_rotated_pyramind {

  public static void pattern(int r, int c) {
    for (int i = 0; i < r; i++) {
      for (int j = 1; j <= c; j++) {
        if (j >= c - i) {
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
    System.out.println("inverted_rotated_pyramind");
    do {
      System.out.print("r:");
      int r = sc.nextInt();
      System.out.print("r:");
      int c = sc.nextInt();
      pattern(r, c);
    } while (true);

  }
}
