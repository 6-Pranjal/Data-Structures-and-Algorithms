import java.util.Scanner;

public class Decreasing_order {

  public static void compute(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(n + " ");
    compute(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter value of n(by recursion) : ");
    int n = sc.nextInt();
    compute(n);
  }
}
