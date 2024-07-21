
import java.util.Scanner;

public class Prime_inRange {

  public static boolean prime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void inRange(int n) {
    for (int i = 1; i <= n; i++) {
      if (prime(i) == true) {
        System.out.print(i + " ");
      }

    }
  }

  public static void main(String[] args) {
    System.out.println("printing all prime numbers in a range");
    Scanner sc = new Scanner(System.in);
    System.out.print("n:");
    int n = sc.nextInt();
    inRange(n);
  }
}
