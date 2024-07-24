import java.util.Scanner;

public class shortest_distance {
  public static void check(String s) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'W' || s.charAt(i) == 'w') {
        x--;
      } else if (s.charAt(i) == 'N' || s.charAt(i) == 'n') {
        y++;
      } else if (s.charAt(i) == 'E' || s.charAt(i) == 'e') {
        x++;
      } else if (s.charAt(i) == 'S' || s.charAt(i) == 's') {
        y--;
      }
    }
    double s_d = Math.sqrt((x * x) + (y * y));
    System.out.print("Shortest Distance Is : " + s_d);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Finding shotest distance:");
    do {
      System.out.print("Enter Distnce as N E W S : ");
      String s = sc.nextLine();
      check(s);
      System.out.println();
    } while (true);

  }
}
