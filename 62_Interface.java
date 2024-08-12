public class Interface {
  public static void main(String[] args) {
    Queen q = new Queen();
    System.out.println("Interface");
    q.move();
  }
}

interface chessplayer {
  void move();
}

class Queen implements chessplayer {
  public void move() {
    System.out.println("Queen can move L R U D And D' ");
  }
}