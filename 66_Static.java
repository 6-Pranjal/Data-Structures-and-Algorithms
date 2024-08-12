public class Static {
  public static void main(String[] args) {
    Student s = new Student();
    s.school = "sbvm";
    System.out.println("s1 school : " + s.school);

    Student s1 = new Student();
    System.out.println("s2 school :(I did not set for this student)" + s.school);

    System.out.println(s1.cgp(90, 98, 99));

  }
}

class Student {
  String name;
  static String school;

  // void setschool(String school){
  // this.school=school;
  // }
  // String getschool(){
  // return this.school;
  // }

  static int cgp(int p, int c, int m) {
    return (p + c + m) / 3;

  }

}