import java.util.Scanner;

public class Fibonacci {
  public static int compute(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    int ans = compute(n - 1) + compute(n - 2);
    return ans;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter value of n(by recursion 0 based indexing ) : ");
    int n = sc.nextInt();
    System.out.println(compute(n));
  }
}
