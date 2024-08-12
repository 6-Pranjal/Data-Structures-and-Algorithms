import java.util.Scanner;

public class Increasing_order {
  public static void compute(int n) {
    if (n == 0) {
      return;
    }
    compute(n - 1);
    System.out.print(n + " ");

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter value of n(by recursion) : ");
    int n = sc.nextInt();
    compute(n);
  }
}
