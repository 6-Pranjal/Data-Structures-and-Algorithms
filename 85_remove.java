public class remove {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }

    public Node() {
      int data;
      Node next = null;
    }

  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void Addnode(int data) {
    Node newnode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newnode;
      return;
    } else {
      tail.next = newnode;
      tail = newnode;
    }
  }

  public void remove_first() {
    head = head.next;
  }

  public void remove_last() {
    Node temp = new Node();
    temp = head;
    while (temp.next != tail) {
      temp = temp.next;
    }
    temp.next = null;
    temp = tail;

  }

  public void Print() {
    System.out.println("printing pinju's linkedlist");
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    remove ll = new remove();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);
    ll.Addnode(8);
    ll.Addnode(90);

    // ll.Print();
    // ll.remove_first();
    // ll.Print();

    ll.remove_last();
    ll.Print();

  }

}
