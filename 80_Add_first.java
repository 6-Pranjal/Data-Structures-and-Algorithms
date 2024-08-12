public class Add_first {
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

  public void addfirst(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      System.out.println("LinkedList is empty");
      head = tail = newnode;
      return;
    }
    System.out.println("LinkedList is not empty");
    head = newnode.next;
    newnode = head;
  }

  public static void main(String[] args) {
    Add_first n1 = new Add_first();

    // n1.head = new Node(98);
    // n1.head.next = new Node(90);

    // Node newnode =new Node(89);
    // newnode.next =n1.head;
    // n1.head=newnode;

    // Add_first n2 = new Add_first();
    // n2.head = new Node(110);
    // n2.head.next = n1.head;
    // n1 =new Node(9); wrong syntax

    n1.addfirst(89);
    n1.addfirst(78);
  }
}
