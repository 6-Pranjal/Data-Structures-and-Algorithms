import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your string");
    String input = sc.next(); // prints only 1st word
    System.out.println(input);
    sc.nextLine();

    System.out.println("enter line");
    String line = sc.nextLine(); // entire line
    System.out.println(line);
  }

}