import java.util.Scanner;

public class equality_xor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("n:");
      int n = sc.nextInt();

      System.out.print("m:");
      int m = sc.nextInt();

      int ans = n ^ m;
      if (ans == 0) {
        System.out.println("they are equal no. :");
      } else {
        System.out.println("they are not equal");
      }
    } while (true);
  }
}
