public class shallow_copy {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Pinju";
    s1.age = 21;
    s1.marks[0] = 90;
    s1.marks[1] = 98;
    System.out.println("details of student 1");
    System.out.println(s1.name + " " + s1.age + " " + s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2]);

    Student s2 = new Student(s1);
    System.out.println("details of student 2");
    System.out.println(s2.name + " " + s2.age + " " + s2.marks[0] + " " + s2.marks[1] + " " + s2.marks[2]);

    s1.marks[2] = 100;
    System.out.println("details of student 1");
    System.out.println(s1.name + " " + s1.age + " " + s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2]);

    System.out.println("details of student 2");
    System.out.println(s2.name + " " + s2.age + " " + s2.marks[0] + " " + s2.marks[1] + " " + s2.marks[2]);

  }
}

class Student {
  String name;
  int age;
  int[] marks = new int[3];// need to define

  Student() {
    System.out.println("feeling something somthing hello honey bunny........");
    System.out.println("jokkes apart pinju is creating copy constructor..............");
  }

  Student(Student s) {
    this.name = s.name;
    this.age = s.age;
    this.marks = s.marks;
  }
}
