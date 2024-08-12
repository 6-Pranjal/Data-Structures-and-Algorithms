/**
 * creation
 */
public class creation {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public static void main(String[] args) {
    // Node n1 = new Node();
    // n1.first_node(45);

    // System.out.println(n1.data + " " + n1.next);
    // System.out.println(n1);

    creation l1 = new creation();
    l1.head = new Node(1);
    l1.head.next = new Node(89);
    System.out.println(l1);

  }
}