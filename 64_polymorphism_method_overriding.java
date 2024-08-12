/**
 * polymorphism_method_overriding
 */
public class polymorphism_method_overriding {
  public static void main(String[] args) {
    Animal a = new Animal();
    System.out.println("name function called for Animal class");
    a.name();

    Fish f = new Fish();
    System.out.println("name function called for Fish class");
    f.name();

  }

}

class Animal {
  void name() {
    System.out.println("Animals");
  }
}

class Fish extends Animal {
  void name() {
    System.out.println("Fish");
  }
}