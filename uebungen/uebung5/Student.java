public class Student {
  public static int numberOfStudents = 0;
  public String name;
  public int matNumber;

  public String getInformation() {
    return "Der Student mit dem namen:" + 
            name + " hat die Matrikelnummer: " + 
            matNumber;
  }

  public boolean isValidMatNumber() {
    if (matNumber >= 10000 && matNumber <= 99999) {
      return true;
    } else {
      return false;
    }
  }

  public void addAStudent() {
    numberOfStudent += 1;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }
}