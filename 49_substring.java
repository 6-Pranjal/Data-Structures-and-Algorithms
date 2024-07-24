import java.util.Scanner;

public class substring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Finding substring:");

    do {
      System.out.print("Enter String:");
      String s = sc.nextLine();

      System.out.print("starting index:");
      int si = sc.nextInt();

      System.out.print("ending index:");
      int ei = sc.nextInt() + 1;

      System.out.print("resultant substring is : " + s.substring(si, ei));

      System.out.println();
    } while (true);

  }
}
