public class Add_last {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addlast(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = tail = newnode;
      return;
    } else {
      tail.next = newnode;
      tail = newnode;
    }
  }

  public static Node head;
  public static Node tail;

  public static void main(String[] args) {
    Add_last l1 = new Add_last();
    l1.addlast(89);

    System.out.println(l1);
  }
}
