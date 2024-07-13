package teacher;
public class Teacher {
   String designation = "Lecturer";
  String collegeName = "ULAB";

  void does() {
    System.out.println("Teaching");
  }
}

public class OOPTeacher extends Teacher {
  String mainSubject = "OOP";

  public static void main(String[] args) {
    OOPTeacher obj = new OOPTeacher();

    System.out.println(obj.collegeName);
    System.out.println(obj.designation);
    System.out.println(obj.mainSubject);
    obj.does();
  }
}