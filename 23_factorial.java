package Functions;

import java.util.Scanner;

public class factorial {

  public static int facto(int n) {
    int product = 1;
    while (n > 0) {
      product = product * n;
      n--;
    }
    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print(" n: ");
      int n = sc.nextInt();
      int ans = facto(n);
      System.out.println(ans);
    } while (true);
  }
}
