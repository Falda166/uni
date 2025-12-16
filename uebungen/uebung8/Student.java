import java.util.*;

/**
 * Student - OOP (Version 3) P1 - Telematik - TH Wildau
 *
 * @author Janett Mohnke
 * @version 1.0
 */
public class Student {

  //attributes (what a student knows)
  private String name;
  private int matNumber;
  private static int numberOfStudents;
  private static ArrayList<Student> allStudents;

  //constructors
  /**
   * standard constructor
   */
  public Student() {
    numberOfStudents++;
    allStudents.add(this);
  }

  /**
   * constructor, which initializes the name and the student number
   *
   * @param name name of student object
   * @param matNumber student number (matriculation number)
   */
  public Student(String name, int matNumber) {
    this();
    this.name = name;
    this.setMatNumber(matNumber);
  }

  /**
   * class constructor
   */
  static {
    allStudents = new ArrayList<>();
  }

  //setter and getter
  /**
   * sets the name of the student
   *
   * @param name name of the student
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * gets the name of the student
   *
   * @return name of the student
   */
  public String getName() {
    return this.name;
  }

  /**
   * sets the student/matriculation number
   *
   * @param matNumber student number
   */
  public void setMatNumber(int matNumber) {
    this.matNumber = matNumber;
    //remark: the following should be an exception
    if (!this.isValidMatNumber()) {
      System.out.println("WARNING: Student number of "
              + this.name + " is not valid. (" + this.matNumber + ")");
      System.out.println("... and set to 0.");
      this.matNumber = 0;
    }
  }

  /**
   * gets the student number
   *
   * @return student number
   */
  public int getMatNumber() {
    return this.matNumber;
  }

  /**
   * returns the current number of Student objects created
   *
   * @return number of Student objects
   */
  public static int getNumberOfStudents() {
    return numberOfStudents; //allStudents.size();
  }

  //methods  (what a student does)
  /**
   * gets the name and matNumber of this Student object
   * @deprecated 
   *
   * @return String with name and matNumber of this Student object
   */
  public String getInformation() {
    return "Student: " + name + " ( " + matNumber + " )";
  }

  /**
   * tests if the current mat number is a five-digit number
   *
   * @return true if mat number of the calling object is valid
   */
  public boolean isValidMatNumber() {
    if (10000 <= this.matNumber && this.matNumber <= 99999) {
      return true;
    }
    return false;
  }

  /*
    * Solution for Exercise No. 3
    */
  /**
   * prints all students with their name and student number
   */
  public static void printAllStudents() {
    System.out.println("\nList of current students:");
    System.out.println("-----------------------------");
    for (Student stud : allStudents) {
      //changed from U6 to U7
      //System.out.println(stud.getInformation());
      System.out.println(stud); //implicite call of toString()
    }
    System.out.println("Number of students: " + getNumberOfStudents());
    System.out.println("-----------------------------");

  }

  // Has to be called before "giving up" a student: stud = null;
  /**
   * removes a student from the system
   */
  public void unenroll() {
    allStudents.remove(this);
    numberOfStudents--;
  }

  
  /*
    * New in Version 3 (EP Ex. No. 7) 
    */
  /**
   * Indicates whether some other Student object s object is "equal to" this
   * one.
   *
   * @param o the other object
   * @return true if the two objects are equal
   */
  @Override
  public boolean equals(Object o) {
    if (o == null) {
      //There is no object for o.
      return false;
    }

    if (this == o) {
      // The calling object and object o are exactly the same (same reference).
      return true;
    }

    // instanceof checks if an object is assignment-compatible to the class.
    // Might become a problem for subclasses. So, better use: 
    if (!o.getClass().equals(getClass())) {
      //The calling object and object o are from different classes.
      return false;
    }

    //Now for sure: o is of type Student.
    Student s = (Student) o;
    //
    return (this.getName().equals(s.getName()) && 
            this.getMatNumber() == s.getMatNumber());   
  }

  /**
   * returns a string representation of the object.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "Student: " + this.getName() + "(Mat.nummer: "
            + this.getMatNumber() + ")";
  }
  
  /**
   * returns a reference to a Student object with name equals name or null
   * @param name the name to be searched for
   * @return reference to a Student object with name equals name, if it exists
   *         or null otherwise
   */
  public static Student getStudent(String name){
    for (Student s : allStudents) {
      if (s.getName().equals(name)) {
        return s;
      }
    }
    return null;
  }
  
  /**
   * returns a reference to a Student object with a matNumber equals matNumber or null
   * @param matNumber the matNumber to be searched for
   * @return reference to a Student object withmatNumber equals matNumber, if it exists
   *         or null otherwise
   */
  public static Student getStudent(int matNumber){
    for (Student s : allStudents) {
      if (s.getMatNumber() == matNumber) {
        return s;
      }
    }
    return null;
  }
}
