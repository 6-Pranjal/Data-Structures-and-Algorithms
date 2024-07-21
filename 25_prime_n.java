package Functions;

import java.util.Scanner;

public class prime_n {

  public static boolean prime(int n) {

    int count = 1;
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
      if (count > 2) {
        System.out.print("not prime :" + n);
        return false;
      }
    }
    System.out.println("prime :" + n);
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("entered number is prime or not");
    do {
      System.out.print("n:");
      int n = sc.nextInt();

      if (n == 1 || n == 0) {
        System.out.println("Not Prime");
      } else {
        System.out.println(prime(n));
      }

    } while (true);

  }
}
