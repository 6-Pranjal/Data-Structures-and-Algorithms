import java.util.Scanner;

public class Continue_odd_no {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("printing odd numbers and skipping even numbers using continue keyword");
    System.out.print("enter value of n : ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
