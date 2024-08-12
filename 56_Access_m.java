public class Access_m {
  public static void main(String[] args) {

    BankA A1 = new BankA();
    A1.name = "pranjal";
    A1.pass = "1234"; // since it's protected;
    A1.amount = 10000000.56f; // compulsory to write f at the end of the number

  }
}

class BankA {
  public String name;
  private String pass;
  protected float amount;
}
