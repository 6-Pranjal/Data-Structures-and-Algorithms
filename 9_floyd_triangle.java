
import java.util.Scanner;

public class floyd_triangle {

  public static void pattern(int r) {
    int k = 1;
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");

        k++;
      }
      System.out.println();

    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" floyd_triangle ");
    do {
      System.out.print("r:");
      int r = sc.nextInt();

      pattern(r);
    } while (true);

  }

}
