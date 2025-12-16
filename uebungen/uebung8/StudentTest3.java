
/**
 * StudentTest3 - OOP P1 - Telematik - TH Wildau
 *
 * @author Janett Mohnke
 * @version 1.0 2019
 */
public class StudentTest3 {

  public static void main(String[] args) {

    //add some students
    Student studi1 = new Student();
    studi1.setName("Isabella Swan");
    studi1.setMatNumber(12345);

    Student studi2 = new Student("Edward Cullen", 54321);
    Student studi3 = new Student("Jacob Blacks", 13);

    Student.printAllStudents();

    //test equals()
    System.out.println("Test equals():");
    System.out.print("Edward equals Edward?  ");
    System.out.println(studi2.equals(studi2) ? "Yes!" : "No!");

    System.out.print("Edward equals Jacob?  ");
    System.out.println(studi2.equals(studi3) ? "Yes!" : "No!");
    
    System.out.print("Edward equals null?  ");
    System.out.println( studi2.equals(null) ? "Yes!" : "No!");
    
    System.out.print("Edward equals \"Edward\"?  ");
    System.out.println( studi2.equals("Edward") ? "Yes!" : "No!");
    
    //test getStudent()
    System.out.println("------------------------------\nTest getStudent():");
    System.out.print("Edward? -> ");
    System.out.println(Student.getStudent("Edward Cullen"));
    
    System.out.print("MatNumber == 12345 ? -> ");
    System.out.println(Student.getStudent(12345));
    
    System.out.print("Otto? -> ");
    System.out.println(Student.getStudent("Otto")); //besser?
    

  }
}
