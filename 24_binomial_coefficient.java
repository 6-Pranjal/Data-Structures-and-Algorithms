package Functions;

import java.util.Scanner;

public class binomial_coefficient {
  public static int facto(int n) {
    int product = 1;
    while (n > 0) {
      product = product * n;
      n--;
    }
    return product;
  }

  public static int b_c(int n, int r) {
    int N_facto = facto(n);
    int R_facto = facto(r);
    int N_R_facto = facto(n - r);
    int ans = N_facto / (R_facto * N_R_facto);
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n:");
    int n = sc.nextInt();

    System.out.print("r:");
    int r = sc.nextInt();

    System.out.println("binomial coefficient : n! / r!*(n-r)!");
    System.out.println("ans:" + b_c(n, r));
  }
}
