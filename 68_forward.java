import java.util.ArrayList;

/**
 * forward
 */
public class forward {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(7);
    list.add(4);
    list.add(19);

    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}