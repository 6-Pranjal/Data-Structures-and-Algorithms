import java.util.Arrays;
import java.util.Scanner;

public class largest_string {
  public static void check(String[] s) {
    String l = s[0];
    for (int i = 1; i < s.length; i++) {
      if (l.compareTo(s[i]) < 0) {
        l = s[i];
      }
    }
    System.out.println("largest String is : " + l);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Lexicographically largest string: ");
    do {
      System.out.print("size : ");
      int n = sc.nextInt();

      sc.nextLine();

      System.out.print("Enter Strings : ");

      String[] s = new String[n];
      for (int i = 0; i < n; i++) {
        s[i] = sc.nextLine();
      }

      System.out.println(Arrays.toString(s));
      check(s);
      System.out.println();
    } while (true);

  }
}
