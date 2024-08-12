public class getter_setter {
  public static void main(String[] args) {
    BankA A1 = new BankA();
    A1.name = "pranjal";
    A1.pass = "1234"; // since it's protected;
    A1.amount = 10000000.56f; // compulsory to write f at the end of the number

    A1.setpass("123pranj");
    System.out.println(A1.pass); // can't access directly
    System.out.println(A1.getpass());

  }
}

class BankA {
  public String name;
  private String pass;
  protected float amount;

  String getpass() {
    return this.pass;
  }

  void setpass(String pass) {
    this.pass = pass;
  }
}
