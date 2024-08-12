import java.util.Scanner;

public class First_occurence {
  public static int compute(int[] n, int i, int key) {

    if (i == n.length) {
      return -1;
    }

    if (n[i] == key) {
      return compute(n, i + 1, key);
    }
    return i;

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
    int key = sc.nextInt();

    System.out.println(compute(n, 0, key));
  }
}
