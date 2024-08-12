public class Super_ {
  public static void main(String[] args) {
    Dogs d = new Dogs();

    Animal a = new Animal();
    System.out.println(a.col);

    System.out.println(d.col);

  }
}

class Animal {
  String col;

  Animal() {
    System.out.println("hello we are Pinju's Animals");
  }
}

class Dogs extends Animal {

  Dogs() {
    super();
    System.out.println("Hello we are Pinju's Dogs");
    super.col = "Beige";

  }
  // super.col="Beige"; can't write here
}
