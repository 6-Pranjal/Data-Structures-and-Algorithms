
import java.util.Scanner;

public class Multiple_10break {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("stop when user enters multiple of 10 ");
    do {

      System.out.print("enter n :");
      int n = sc.nextInt();
      if (n % 10 == 0) {
        break;
      }
    } while (true);
  }
}
