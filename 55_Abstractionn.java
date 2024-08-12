public class Abstractionn {
  public static void main(String[] args) {
    Donkey d = new Donkey();
    System.out.println("Abstract class");
    d.work();
  }
}

abstract class Animal {
  abstract void work();
}

class Donkey extends Animal {
  void work() {
    System.out.println("Donkey HardWorks without Brain ");
  }
}