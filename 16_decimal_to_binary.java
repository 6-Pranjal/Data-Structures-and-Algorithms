import java.util.Scanner;

public class decimal_to_binary {

  public static int convert(int n) {

    int ans = 0;
    int i = 0;
    while (n > 1) {
      int r = n % 2;

      ans = ans + (int) (Math.pow(10, i)) * r;
      n = n / 2;
      i++;

    }
    ans = ans + (int) (Math.pow(10, i)) * n; // most imp

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("decimal to binary conversion");
    do {
      System.out.print("n:");
      int n = sc.nextInt();
      System.out.println("in binary");
      System.out.println(convert(n));
    } while (true);

  }

}