import java.util.Scanner;

public class sum_n {
  public static int compute(int n) {
    if (n == 1) {
      return 1;
    }

    int fact_N_1 = compute(n - 1);
    int fact = n + fact_N_1;

    return fact;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter value of n(by recursion) : ");
    int n = sc.nextInt();
    System.out.println(compute(n));
  }
}
