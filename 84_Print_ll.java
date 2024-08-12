public class Print_ll {
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

  public void Addnode(int data) {
    Node newnode = new Node(data);
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
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    Print_ll ll = new Print_ll();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);

    ll.Print();

  }

}
