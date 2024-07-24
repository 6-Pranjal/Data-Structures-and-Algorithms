import java.util.Scanner;

public class power_of_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n:");
    int n = sc.nextInt();

    if ((n & (n - 1)) == 0) {
      System.out.println(n + " power of 2");
    } else {
      System.out.println(n + " not in power of 2");
    }
  }
}
