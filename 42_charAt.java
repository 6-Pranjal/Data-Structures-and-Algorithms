import java.util.Scanner;

public class charAt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your String");
    String value = sc.nextLine();

    // System.out.println(value);

    for (int i = 0; i < value.length(); i++) {
      System.out.print(value.charAt(i) + " ");

    }

    // int[] arr = { 1, 4, 5, 7, 8, 9 };

    // for (int i : arr) {
    // System.out.print(i);
    // System.out.print(" ");
    // }

  }
}
