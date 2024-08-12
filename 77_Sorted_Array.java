import java.util.Scanner;

public class Sorted_Array {
  public static boolean compute(int[] n, int i) {

    if (i == n.length - 1) {
      return true;
    }

    if (n[i] > n[i + 1]) {
      return false;
    }

    return compute(n, i + 1);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter value of n(by recursion 0 based indexing ) : ");
    System.out.print("n:");
    int size = sc.nextInt();
    int[] n = new int[size];
    System.out.print("enter values:");
    for (int i = 0; i < size; i++) {
      n[i] = sc.nextInt();
    }

    System.out.println(compute(n, 0));
  }

}
