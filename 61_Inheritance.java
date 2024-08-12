public class Inheritance {
  public static void main(String[] args) {
    Bhalu b1 = new Bhalu();
    b1.Breed = "polar Bear";
    b1.name = "juju";
    b1.canwalk();

    System.out.println(b1.name);
    System.out.println(b1.Breed);

  }
}

class Animal {
  String name;

  void canwalk() {
    System.out.println(this.name + " can walk");
  }
}

class Bhalu extends Animal {
  String Breed;
}