package DoWhileloops;

import java.util.Scanner;

public class MenuSelection {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("1. Option 1");
      System.out.println("2. Option 2");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
    } while (choice < 1 || choice > 3);
    System.out.println("You selected: " + choice);
    scanner.close();
  }
}
