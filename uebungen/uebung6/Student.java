import java.util.ArrayList;

public class Student {
  /*
  * Konstruktoren sind besser als createStudent(),
  * weil sie beim Erzeugen des Objekts automatisch
  * aufgerufen werden und so sicherstellen, dass
  * jedes Objekt direkt richtig initialisiert ist.
  */

  private static int numberOfStudents = 0;
  private String name;
  private int matNumber;
  public static ArrayList<Student> allStudents = new ArrayList<>();

  public Student() 
  {
    this.name = "Unbekannt";
    this.matNumber = 0;
    numberOfStudents++;
    allStudents.add(this);
  }

  public Student(String name, int matNumber) 
  {
    this.name = name;
    if (matNumber >= 10000 && matNumber <= 99999)
    {
      this.matNumber = matNumber;
    }
    else
    {
      this.matNumber = 0;
    }
    numberOfStudents++;
    allStudents.add(this);
  }

  public String getName() 
  {
    return name;
  }

  public void setName() 
  {
    this.name = name;
  }

  public int getMatNumber() 
  {
    return matNumber;
  }

  public void setMatNumber(int matNumber)
  {
    this.matNumber = matNumber;
  }

  public String getInformation() 
  {
    return "Der Student mit dem Namen: " + name +
            " hat die Matrikelnummer: " + matNumber;
  }

  public boolean isValidMatNumber() 
  {
    return matNumber >= 10000 && matNumber <= 99999;
  }

  public static int getNumberOfStudents() 
  {
    return numberOfStudents;
  }

  public static void printAllInformation() 
  {
    for (Student s : allStudents) {
      System.out.println(s.name + " | " + s.matNumber);
    }
  }
}