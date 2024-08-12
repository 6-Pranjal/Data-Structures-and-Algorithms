public class Constructor {
  public static void main(String[] args) {
    Placement p1 = new Placement();
  }
} // this was the issue bhai }

class Placement { // you need to write ststic keyword
  // String name;
  Placement() {
    System.out.println("Your campus drive has been started......");
  }
  // Placement(String name){

  // }

}
