package Patterns;

import java.util.Scanner;

public class pattern5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("rows : ");
    int n = sc.nextInt();
    char v = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(v);
        v++;
      }
      System.out.println();

    }
  }
}
