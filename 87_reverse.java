public class reverse {
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

  public void Print() {
    System.out.println("printing pinju's linkedlist");
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public void reverse() {
    Node p = null;
    Node c = tail = head;
    Node n;

    while (c != null) {
      n = c.next;
      c.next = p;
      p = c;
      c = n;
    }
    head = p;
  }

  public static void main(String[] args) {
    reverse ll = new reverse();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);
    ll.Addnode(8);
    ll.Addnode(90);

    ll.Print();
    System.out.println("Reversed Linked List");
    ll.reverse();
    ll.Print();

    // ll.Print();
    // ll.Addmid(2, 10);
    // ll.Print();

    // System.out.println("index=0");
    // System.out.println("adding 100 at index 0");
    // ll.addfirst(100);

  }

}
