public class add_midd {
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

  public void addfirst(int data) {
    Node newnode = new Node(data);
    newnode.next = head;
    head = newnode;
  }

  public void Addmid(int index, int data) {

    if (index == 0) {
      addfirst(data);
      return;
    }

    Node newnode = new Node(data);
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

  public static void main(String[] args) {
    add_midd ll = new add_midd();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);

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

  }

}
