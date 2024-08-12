
public class Classes {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.color = "red";
    p1.tip = 13;
    System.out.println(p1);
    System.out.println(p1.color);
    System.out.println(p1.tip);

    p1.setcolr("navy");
    p1.settip(2);

    // System.out.println(p1);
    System.out.println(p1.toString());

    System.out.println(p1.color);
    System.out.println(p1.tip);
  }
}

class Pen {
  int tip;
  String color;

  void setcolr(String col) {
    color = col;
  }

  void settip(int n_tip) {
    tip = n_tip;
  }

}