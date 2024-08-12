public class search {
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

  public void search(int key) {
    int i = 0;
    Node temp = head;
    {
      while (temp.next != null) {
        temp = temp.next;
        if (temp.data == key) {
          System.out.println("node found at index:" + (i + 1));
          return;
        }
        i++;
      }
      System.out.println("key is not found");

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
    search ll = new search();

    ll.Addnode(98);
    ll.Addnode(87);
    ll.Addnode(78);
    ll.Addnode(8);
    ll.Addnode(90);

    ll.Print();
    System.out.println("key=7");
    ll.search(7);
    System.out.println("key=90");
    ll.search(90);

  }

}
