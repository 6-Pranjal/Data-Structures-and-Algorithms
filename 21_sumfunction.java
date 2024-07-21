package Functions;

import java.util.Scanner;

public class sum {

  public static int summ(int a, int b) {
    System.out.print("ans : ");
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a : ");
    int a = sc.nextInt();
    System.out.print("b : ");
    int b = sc.nextInt();
    int ans = summ(a, b);
    System.out.println(ans);
  }
}
