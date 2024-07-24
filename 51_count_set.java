import java.util.Scanner;

public class count_set {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n:");
    int n = sc.nextInt();
    int count = 0;

    while (n > 0) {
      if ((n & 1) != 0) {
        count++;
      }
      n = n >> 1;
    }
    System.out.println(" number of 1s present are " + count);

  }
}
