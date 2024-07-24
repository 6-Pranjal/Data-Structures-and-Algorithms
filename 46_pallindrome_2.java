import java.util.Scanner;

public class pallindrome_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("check is your string pallindrome or not");
    do {
      System.out.println("enter your string : ");
      String s = sc.nextLine();
      int j = s.length() - 1;
      for (int i = 0; i <= s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(j)) {
          System.out.println(s + " is not a pallindrome");
          break;
        }
        if (i == s.length() / 2) {
          System.out.println(s + " is pallindrome");
        }
      }

    } while (true);

  }
}
