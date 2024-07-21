package Functions;

import java.util.Scanner;

public class product {

  public static int product(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a: ");
    int a = sc.nextInt();
    System.out.print("b: ");
    int b = sc.nextInt();
    int ans = product(a, b);
    System.out.println("ans : " + ans);
  }
}
