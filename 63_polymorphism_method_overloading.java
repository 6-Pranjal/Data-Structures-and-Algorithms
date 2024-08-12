public class polymorphism_method_overloading {
  public static void main(String[] args) {
    System.out.println("Pinju ka calci");
    Calci c1 = new Calci();
    System.out.println("Integer");
    c1.sum(10, 12);
    System.out.println("Float");
    c1.sum(13.5f, 13.45f);
  }
}

class Calci {
  void sum(int a, int b) {
    System.out.println("sum is : " + (a + b));
  }

  void sum(float a, float b) {
    System.out.println("sum is : " + (a + b));
  }
}