import java.util.ArrayList;

public class max_value {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(7);
    list.add(4);
    list.add(19);

    System.out.println(list);
    int max = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      max = Math.max(max, list.get(i));
    }
    System.out.println(max);
  }
}
