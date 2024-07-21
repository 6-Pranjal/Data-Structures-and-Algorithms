import java.util.Scanner;

public class binary_to_decimal {
  public static int convert(int n) {
    int i = 0;
    int ans = 0;
    while (n > 0) {
      int r = n % 10;
      int pow = (int) (Math.pow(2, i)) * r;
      ans = ans + pow;
      n = n / 10;
      i++;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("binary to decimal");
    Scanner sc = new Scanner(System.in);
    System.out.print("n:");
    int n = sc.nextInt();
    System.out.println(convert(n));

  }
}
