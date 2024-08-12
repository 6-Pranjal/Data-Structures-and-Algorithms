import java.util.ArrayList;

public class N_dLIST {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    ArrayList<Integer> l1 = new ArrayList<>();

    l1.add(12);
    l1.add(90);

    list.add(l1);

    ArrayList<Integer> l2 = new ArrayList<>();
    l2.add(89);
    l2.add(98);

    list.add(l2);
    System.out.println(list);
  }
}
