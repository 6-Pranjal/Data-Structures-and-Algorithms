public class remove_from_last {
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

  public void remove_last(int target) {
    if (target == size) {
      head = head.next;
      size--;
      return;
    }
    Node temp = head;
    int i = 0;
    int n = size - target;
    while (i < n - 1) {
      temp = temp.next;
      i++;
    }
    // Node r = temp.next;
    temp.next = temp.next.next;
    size--;
  }

  public static void main(String[] args) {
    remove_from_last ll = new remove_from_last();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);
    ll.Addnode(8);
    ll.Addnode(90);

    ll.Print();
    System.out.println();
    System.out.println("size:" + size);

    // ll.Print();
    // ll.Addmid(2, 10);
    // ll.Print();

    // System.out.println("index=0");
    // System.out.println("adding 100 at index 0");
    // ll.addfirst(100);

    System.out.println("target node is 5 (first node)");
    ll.remove_last(5);
    ll.Print();

    System.out.println("size:" + size);
    System.out.println("target node is 3");
    ll.remove_last(3);
    ll.Print();

  }

}
