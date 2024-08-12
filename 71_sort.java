import java.util.ArrayList;
import java.util.Collections;

public class sort {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(7);
    list.add(4);
    list.add(19);

    System.out.println(list);
    Collections.sort(list);
    System.out.println("Increasing order : " + list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println("Decreasing order : " + list);
  }
}
