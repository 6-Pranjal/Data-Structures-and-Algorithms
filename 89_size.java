public class size {
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

  public void addfirst(int data) {
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
    size++;
  }

  public void Addmid(int index, int data) {

    if (index == 0) {
      addfirst(data);
      return;
    }

    Node newnode = new Node(data);
    size++;
    Node temp = new Node(data);
    temp = head;
    int i = 0;

    while (i < index - 1) {
      temp = temp.next;
      i++;
    }

    newnode.next = temp.next;
    temp.next = newnode;
  }

  public void Print() {
    System.out.println("printing pinju's linkedlist");
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public void size_ll() {
    int i = 0;
    Node temp = new Node();
    temp = head;

    while (temp != null) {
      i++;
      temp = temp.next;
    }
    System.out.println("total nodes:" + i);

  }

  public static void main(String[] args) {
    size ll = new size();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);
    ll.Addnode(8);
    ll.Addnode(90);

    // ll.Print();

    System.out.println("considering ll is starting with index 0");

    // ll.Addmid(2, 10);
    // ll.Print();

    // System.out.println("index=0");
    // System.out.println("adding 100 at index 0");
    // ll.addfirst(100);
    // ll.Print();

    ll.Addmid(0, 178);
    ll.Print();
    ll.size_ll();

  }

}
